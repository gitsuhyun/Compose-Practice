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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.compose_practice.R
import com.example.compose_practice.screens.Screens
import com.example.compose_practice.ui.theme.ComposePracticeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlusScreen(
    navController: NavController
) {
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

                //생각 구름
                Column (
                    verticalArrangement = Arrangement.spacedBy(20.dp), //간격
                ){
                    thinkCloudBox(navController)
                }
            }
        }
    }
}

@Composable
private fun thinkCloudBox(
    navController: NavController
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(size = 10.dp))
            .padding(horizontal = 11.dp, vertical = 16.dp),
    ) {
        Column {
            //구름 top
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp), //간격
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iv_plus_cloud_image),
                    contentDescription = "구름 이미지",
                    modifier = Modifier.size(70.dp)
                )
                Column(
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "테슬라 주가 갑자기 오른 이유는?",
                        style = ComposePracticeTheme.typography.Ln1_sb.copy(color = ComposePracticeTheme.colors.black)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    //tag
                    Box(
                        modifier = Modifier
                            .background(
                                color = ComposePracticeTheme.colors.v1,
                                shape = RoundedCornerShape(size = 5.dp)
                            )
                            .padding(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(
                            text = "글로벌",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.v5)
                        )
                    }
                }

            }

            //구름 body
            Box(
                modifier = Modifier
                    .border(
                        width = 1.dp,
                        color = ComposePracticeTheme.colors.g1,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .fillMaxWidth()
                    .background(
                        color = ComposePracticeTheme.colors.g1,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .padding(horizontal = 17.dp, vertical = 12.dp)
            ) {
                Text(
                    text = "테슬라 주가 갑자기 오른 이유는?",
                    style = ComposePracticeTheme.typography.Caption1_m.copy(color = ComposePracticeTheme.colors.g5)
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            //구름 bottom
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                //시간
                Image(
                    painter = painterResource(id = R.drawable.ic_history),
                    contentDescription = null,
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "1분전",
                    style = ComposePracticeTheme.typography.Caption2_r.copy(color = ComposePracticeTheme.colors.g4)
                )
                Spacer(modifier = Modifier.weight(1f))
                //생각더하기 이동 버튼
                Box(
                    modifier = Modifier
                        .height(30.dp)
                        .background(
                            color = ComposePracticeTheme.colors.v6,
                            shape = RoundedCornerShape(size = 29.dp)
                        )
                        .padding(start = 16.dp, end = 8.dp, top = 6.dp, bottom = 6.dp)
                        .clickable { navController.navigate("plusOnboarding") }
                ) {
                    Row {
                        Text(
                            text = "생각더하기",
                            style = ComposePracticeTheme.typography.Label2_sb.copy(color = Color.White),
                            modifier = Modifier.padding(end = 4.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_arrow_right),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = Modifier.size(18.dp)
                        )

                    }
                }
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