package com.example.compose_practice.screens.plus

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlusThinksScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            //뒤로가기
                        }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_arrow_left),
                            contentDescription = "Back"
                        )
                    }
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = ComposePracticeTheme.colors.white)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = ComposePracticeTheme.colors.g1)
                .padding(innerPadding),
        ) {
            Column {
                //상단 타이틀
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp)
                        .background(color = ComposePracticeTheme.colors.white)

                ) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 31.dp, vertical = 20.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                    ) {
                        Row {
                            Text(
                                text = "나의 생각 ",
                                style = ComposePracticeTheme.typography.Heading1_b.copy(color = ComposePracticeTheme.colors.v6)
                            )
                            Text(
                                text = "모음",
                                style = ComposePracticeTheme.typography.Heading1_b.copy(color = Color.Black)
                            )
                        }
                        Text(
                            text = "이 뉴스레터를 통해 나는 이렇게 생각했어요.",
                            style = ComposePracticeTheme.typography.Caption1_m.copy(color = ComposePracticeTheme.colors.g4)
                        )


                    }
                }
                //버튼 레이아웃
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 22.dp)
                ) {
                    //생각 카드 레이아웃
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .border(
                                    width = 1.dp,
                                    color = ComposePracticeTheme.colors.g1,
                                    shape = RoundedCornerShape(size = 8.dp)
                                )
                                .fillMaxWidth()
                                .background(
                                    color = ComposePracticeTheme.colors.white,
                                    shape = RoundedCornerShape(size = 8.dp)
                                )
                                .padding(vertical = 15.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "테슬라의 기술 혁신",
                                style = ComposePracticeTheme.typography.Lr1_sb.copy(color = ComposePracticeTheme.colors.g6)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    //이동 버튼
                    nextButton()
                }
            }
        }
    }
}

@Composable
private fun nextButton() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(
                color = ComposePracticeTheme.colors.v6,
                shape = RoundedCornerShape(size = 50.dp)
            )
            .padding(vertical = 12.dp)
            .clickable {
                //navigate
            },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "완료하기",
            style = ComposePracticeTheme.typography.Bn1_b.copy(color = Color.White)
        )
    }
}

@Preview
@Composable
fun PlusThinksPreview() {
    PlusThinksScreen()
}