package com.example.compose_practice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class) // AppBar에 필요한 Experimental API 사용
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("마이페이지", style = ComposePracticeTheme.typography.Headline1_b.copy(color = ComposePracticeTheme.colors.black)) },
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
                    modifier = Modifier.fillMaxWidth().padding(start = 19.dp, end = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(painter = painterResource(id = R.drawable.ic_profile), contentDescription = null, modifier = Modifier.size(60.dp))
                    Column (
                        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ){
                        Image(painter = painterResource(id = R.drawable.ic_level), contentDescription = null)
                        Text(text = "김두둑", style = ComposePracticeTheme.typography.Bn1_b.copy(color = ComposePracticeTheme.colors.black))
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    Image(painter = painterResource(id = R.drawable.ic_dotori), contentDescription = null,  modifier = Modifier.size(38.dp))
                    Text(text = "20", style = ComposePracticeTheme.typography.Br1_sb.copy(color = ComposePracticeTheme.colors.black))
                }
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){
                    Column(
                        verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(text = "팔로워", style = ComposePracticeTheme.typography.Caption1_r.copy(color = ComposePracticeTheme.colors.g4))
                        Text(text = "0", style = ComposePracticeTheme.typography.Ln1_m.copy(color = ComposePracticeTheme.colors.g6))
                    }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        Text(text = "팔로잉", style = ComposePracticeTheme.typography.Caption1_r.copy(color = ComposePracticeTheme.colors.g4))
                        Text(text = "0", style = ComposePracticeTheme.typography.Ln1_m.copy(color = ComposePracticeTheme.colors.g6))
                    }
                }

                //
                Text(text = "목표 달성률", style = ComposePracticeTheme.typography.Headline2_b.copy(color = ComposePracticeTheme.colors.g6))
                Text(text = "나의 아카이브", style = ComposePracticeTheme.typography.Headline2_b.copy(color = ComposePracticeTheme.colors.g6))

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
