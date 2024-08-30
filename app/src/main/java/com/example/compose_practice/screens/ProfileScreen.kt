package com.example.compose_practice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme
import com.example.compose_practice.ui.theme.GoodMoney
import com.example.compose_practice.ui.theme.black
import com.example.compose_practice.ui.theme.g4
import com.example.compose_practice.ui.theme.v1

@OptIn(ExperimentalMaterial3Api::class) // AppBar에 필요한 Experimental API 사용
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("마이페이지") },
                actions = {
                    IconButton(onClick = {
                        //세팅 페이지 이동
                    }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_setting),
                            contentDescription = "Settings"
                        )
                    }
                },
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(painter = painterResource(id = R.drawable.ic_profile), contentDescription = null)
                    Column {
                        Image(painter = painterResource(id = R.drawable.ic_level), contentDescription = null)
                        Text(text = "김두둑")
                    }
                    Image(painter = painterResource(id = R.drawable.ic_dotori), contentDescription = null)
                    Text(text = "20")
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Column(
                        verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(text = "팔로워", style = TextStyle(color = g4))
                        Text(text = "0")
                    }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(text = "팔로잉", style = TextStyle(color = g4))
                        Text(text = "0")
                    }
                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
