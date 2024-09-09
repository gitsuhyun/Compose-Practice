package com.example.compose_practice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose_practice.screens.HomeScreen
import com.example.compose_practice.screens.plus.PlusScreen
import com.example.compose_practice.screens.ProfileScreen
import com.example.compose_practice.screens.Screens
import com.example.compose_practice.screens.ShareScreen
import com.example.compose_practice.screens.plus.PlusOnboardingScreen
import com.example.compose_practice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                MyBottomAppBar()
            }
        }
    }
}

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBottomAppBar() {
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember {
        mutableStateOf(Icons.Default.Home)
    }
    //네비바 visibility
    var showBottomBar by remember { mutableStateOf(true) }

    Scaffold(
        bottomBar = {
            if (showBottomBar) {
                BottomAppBar(
                    contentColor = Color.White,
                    containerColor = Color.White
                ) {
                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Home
                            navigationController.navigate(Screens.Home.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        NavItem(
                            icon = Icons.Default.Home,
                            selected = selected,
                            selectedIcon = Icons.Default.Home,
                            label = "홈"
                        )
                    }

                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Add
                            navigationController.navigate(Screens.Plus.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        NavItem(
                            icon = Icons.Default.Add,
                            selected = selected,
                            selectedIcon = Icons.Default.Add,
                            label = "생각더하기"
                        )
                    }

                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Share
                            navigationController.navigate(Screens.Share.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        NavItem(
                            icon = Icons.Default.Share,
                            selected = selected,
                            selectedIcon = Icons.Default.Share,
                            label = "생각나누기"
                        )
                    }

                    IconButton(
                        onClick = {
                            selected.value = Icons.Default.Person
                            navigationController.navigate(Screens.Profile.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        NavItem(
                            icon = Icons.Default.Person,
                            selected = selected,
                            selectedIcon = Icons.Default.Person,
                            label = "마이페이지"
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.Home.screen,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screens.Home.screen) { HomeScreen() }
            composable(Screens.Plus.screen) { PlusScreen(navigationController) }
            composable(Screens.Plus.PlusOnboarding.screen) {
                showBottomBar = false
                PlusOnboardingScreen()
            }
            composable(Screens.Share.screen) { ShareScreen() }
            composable(Screens.Profile.screen) { ProfileScreen() }
        }
    }
}

@Composable
fun RowScope.NavItem(
    icon: ImageVector,
    selected: MutableState<ImageVector>,
    selectedIcon: ImageVector,
    label: String,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            modifier = Modifier.size(26.dp),
            tint = if (selected.value == selectedIcon) Color.Blue else Color.DarkGray
        )
        Text(
            text = label,
            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.g6),
        )
    }
}