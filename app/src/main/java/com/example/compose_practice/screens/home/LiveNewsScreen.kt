package com.example.compose_practice.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LiveNewsScreen() {
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
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.White)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = ComposePracticeTheme.colors.g1)
                .padding(innerPadding),
        ) {
            // 스크롤 상태를 기억
            val scrollState = rememberScrollState()

            Column (
                modifier = Modifier.verticalScroll(scrollState)
            ){
                Box(
                    modifier = Modifier
                        .background(color = ComposePracticeTheme.colors.white)
                        .padding(horizontal = 16.dp, vertical = 5.dp)
                ) {
                    Column {
                        //인기 순위 칩
                        rankingChip()
                        Spacer(modifier = Modifier.height(12.dp))
                        newsTitle()
                        Spacer(modifier = Modifier.height(16.dp))
                        newsInfo()
                        //구분선
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 16.dp, bottom = 20.dp),
                            color = ComposePracticeTheme.colors.g1, // 원하는 회색으로 설정
                            thickness = 1.dp // 선의 두께
                        )
                        //3줄 요약
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    color = ComposePracticeTheme.colors.g1,
                                    shape = RoundedCornerShape(size = 10.dp)
                                )
                                .padding(horizontal = 24.dp, vertical = 20.dp),
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                            ) {
                                Text(
                                    text = "3줄 요약",
                                    style = ComposePracticeTheme.typography.Headline1_b.copy(
                                        color = ComposePracticeTheme.colors.v6,
                                    )
                                )
                                //요약
                                repeat(3) {
                                    summary()
                                }
                            }

                        }
                        //뉴스 전문 보기
                        moveToNewsSource()
                        Spacer(modifier = Modifier.height(45.dp))
                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            //코멘트 타이틀
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "이 ",
                                    style = ComposePracticeTheme.typography.Br2_sb.copy(
                                        color = ComposePracticeTheme.colors.black,
                                    ),
                                    textAlign = TextAlign.Center
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.tv_live),
                                    contentDescription = null,
                                )
                                Text(text = " ")
                                Image(
                                    painter = painterResource(id = R.drawable.tv_newthink),
                                    contentDescription = null,
                                )
                                Text(
                                    text = "에 대한 생각 듣고싶어요!",
                                    style = ComposePracticeTheme.typography.Br2_sb.copy(
                                        color = ComposePracticeTheme.colors.black,
                                    ),
                                    textAlign = TextAlign.Center
                                )
                            }
                            //코멘트 구름 이미지
                            Image(
                                painter = painterResource(id = R.drawable.iv_excited_cloud),
                                contentDescription = null,
                                contentScale = ContentScale.Crop
                            )
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        //내 생각 작성 버튼
                        commentButton()
                        Spacer(modifier = Modifier.height(23.dp))
                    }

                }
                Spacer(modifier = Modifier.height(8.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = ComposePracticeTheme.colors.white)
                        .padding(top = 36.dp)
                ) {
                    Column {
                        Text(
                            text = "다른 사람들의 생각은?",
                            style = ComposePracticeTheme.typography.Headline2_b.copy(
                                color = ComposePracticeTheme.colors.black,
                            ),
                            modifier = Modifier.padding(start = 16.dp, bottom = 17.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.iv_comment_blind),
                            contentDescription = null,
                            modifier = Modifier.fillMaxWidth(),
                            contentScale = ContentScale.FillWidth
                            )
                    }

                }
            }

        }
    }
}

@Composable
private fun moveToNewsSource() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "뉴스 전문 보기",
            style = ComposePracticeTheme.typography.Caption1_m.copy(
                color = ComposePracticeTheme.colors.g4,
            ),
            textAlign = TextAlign.End
        )
        Image(
            painter = painterResource(id = R.drawable.ic_arrow_right),
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            colorFilter = ColorFilter.tint(ComposePracticeTheme.colors.g4)
        )
    }
}

@Composable
private fun summary() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(11.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_summary_cloud),
            contentDescription = null,
        )
        Text(
            text = "3줄 요약 내용",
            style = ComposePracticeTheme.typography.Ln1_r.copy(
                color = ComposePracticeTheme.colors.g6,
            )
        )
    }
}

@Composable
private fun commentButton() {
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
            text = "내 생각 작성하기",
            style = ComposePracticeTheme.typography.Bn1_b.copy(color = Color.White)
        )
    }
}

@Composable
private fun newsInfo() {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        newsTag()
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = "2024.04.25",
            style = ComposePracticeTheme.typography.Ln1_r.copy(
                color = ComposePracticeTheme.colors.g4,
            ),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.weight(1f))
        //작성자
        Image(
            painter = painterResource(id = R.drawable.ic_profile),
            contentDescription = null,
            modifier = Modifier
                .size(18.dp)
                .padding(end = 3.dp)
        )
        Text(
            text = "Edit By.",
            style = ComposePracticeTheme.typography.Caption2_r.copy(
                color = ComposePracticeTheme.colors.g3,
            ),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Amy",
            style = ComposePracticeTheme.typography.Caption2_m.copy(
                color = ComposePracticeTheme.colors.g3,
            ),
            textAlign = TextAlign.Center
        )


    }
}

@Composable
private fun newsTag() {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = ComposePracticeTheme.colors.g1,
                shape = RoundedCornerShape(size = 4.dp)
            )
            .background(
                color = ComposePracticeTheme.colors.g1,
                shape = RoundedCornerShape(size = 4.dp)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = "미국경제",
            style = ComposePracticeTheme.typography.Caption2_m.copy(
                color = ComposePracticeTheme.colors.g6,
            )
        )
    }
}

@Composable
private fun rankingChip() {
    Box(
        modifier = Modifier
            .border(
                width = 1.dp,
                color = ComposePracticeTheme.colors.g2,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .background(
                color = ComposePracticeTheme.colors.white,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Row {
            Text(
                text = "실시간",
                style = ComposePracticeTheme.typography.Caption2_sb.copy(
                    color = ComposePracticeTheme.colors.g5,
                )
            )
            Text(
                text = " TOP1",
                style = ComposePracticeTheme.typography.Caption2_sb.copy(
                    color = ComposePracticeTheme.colors.v5,
                )
            )

        }
    }
}

@Composable
private fun newsTitle() {
    Row {
        Text(
            text = "“코인 급등 랠리?”\n도지코인 거래 급감",
            style = ComposePracticeTheme.typography.Title2_sb.copy(
                color = ComposePracticeTheme.colors.black,
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        //북마크 이미지
        Image(
            painter = painterResource(id = R.drawable.ic_bookmark_unfill),
            contentDescription = null,
        )

    }
}

