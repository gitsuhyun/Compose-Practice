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
import androidx.compose.ui.unit.sp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun NewsLetterScreen() {
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

            Column(
                modifier = Modifier.verticalScroll(scrollState)
            ) {
                //뉴스 대표 이미지
                Image(
                    painter = painterResource(id = R.drawable.iv_newsletter),
                    contentDescription = null,
                    modifier = Modifier
                        .height(142.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
                Box(
                    modifier = Modifier
                        .background(color = ComposePracticeTheme.colors.white)
                        .padding(horizontal = 16.dp, vertical = 28.dp)
                ) {
                    Column {
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
                        Spacer(modifier = Modifier.height(11.dp))
                        //뉴스 내용 부분
                        Column (
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ){
                            Text(
                                text = "불과 몇 주 사이에 미국 통화 정책을 바라보는 분위기가 완전히 바뀌었어요. 얼마 전까진 다들 ‘올해 6월에 금리 인하가 시작될 것’이라고 했는데, 이젠 ‘아직 멀었다’는 사람이 많아졌죠.\n" +
                                        "\n" +
                                        "지난 16일(현지시간) 제롬 파월 미국 연방준비제도(Fed·연준) 의장은 사실상 6월 금리 인하가 무산됐음을 인정했어요. 파월 의장은 “최근 데이터는 (금리 인하에 대한) 확신을 주지 못했고, 그런 확신을 얻는 데에는 예상보다 더 오랜 시간이 걸릴 것”이라고 말했어요.",
                                style = ComposePracticeTheme.typography.Ln1_r.copy(
                                    color = ComposePracticeTheme.colors.black,
                                ),
                            )
                        }
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
                                    text = "오늘의 ",
                                    style = ComposePracticeTheme.typography.Br2_sb.copy(
                                        color = ComposePracticeTheme.colors.black,
                                    ),
                                    textAlign = TextAlign.Center
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.tv_newthink),
                                    contentDescription = null,
                                )
                                Text(
                                    text = " 어떠셨나요?",
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
                        Spacer(modifier = Modifier.height(12.dp))
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                //코멘트 박스
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
private fun summary() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(11.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_summary_cloud),
            contentDescription = null,
        )
        Text(
            text = "물가상승률이 예상보다 높아 불과 몇 주 만에 전문가들의 미국 기준금리 인하 예상 시점이 한참 미뤄졌음.",
            style = ComposePracticeTheme.typography.Ln1_r.copy(
                color = ComposePracticeTheme.colors.g6,
            ),
            modifier = Modifier.padding(top = 5.dp)
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
            text = "글로벌",
            style = ComposePracticeTheme.typography.Caption2_m.copy(
                color = ComposePracticeTheme.colors.g6,
            )
        )
    }
}

@Composable
private fun newsTitle() {
    Row {
        Text(
            text = "누구도 예측 못한\n미국 경제 흐름",
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