package com.example.compose_practice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlusScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "생각더하기",
                        style = ComposePracticeTheme.typography.Headline1_b.copy(color = ComposePracticeTheme.colors.black)
                    )
                },
                actions = {
                    IconButton(onClick = {
                        //세팅 페이지 이동
                    }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_calendar),
                            contentDescription = null
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.White)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = ComposePracticeTheme.colors.g1)
                .padding(innerPadding)
        ) {
            Column(
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 20.dp)
            ) {
                //생각더하기 타이틀
                plusTitle()

                //정렬
                sortCloud()
            }
        }
    }
}

@Composable
private fun plusTitle() {
    Row(
        modifier = Modifier
            .padding(bottom = 4.dp)
    ) {
        Text(
            text = "나의 ",
            style = ComposePracticeTheme.typography.Heading1_b.copy(color = ComposePracticeTheme.colors.black)
        )
        Text(
            text = "생각구름",
            style = ComposePracticeTheme.typography.Heading1_b.copy(color = ComposePracticeTheme.colors.v6)
        )
    }
    Text(
        text = "생각구름을 키우며 생각해볼까요?",
        style = ComposePracticeTheme.typography.Caption1_m.copy(color = ComposePracticeTheme.colors.g4)

    )
}

@Composable
private fun sortCloud() {
    Row(
        modifier = Modifier
            .padding(bottom = 11.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        Text(
            text = "최근 등록순",
            style = ComposePracticeTheme.typography.Caption1_m.copy(
                color = ComposePracticeTheme.colors.g4,
                textAlign = TextAlign.End
            )
        )
        Spacer(modifier = Modifier.width(5.dp))
        Image(
            painter = painterResource(id = R.drawable.ic_sort_down),
            contentDescription = null
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PlusScreenPreview() {
    PlusScreen()
}