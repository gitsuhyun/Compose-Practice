package com.example.compose_practice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
                title = {
                    Text(
                        "마이페이지",
                        style = ComposePracticeTheme.typography.Headline1_b.copy(color = ComposePracticeTheme.colors.black)
                    )
                },
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
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color.White)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            // 스크롤 상태를 기억
            val scrollState = rememberScrollState()

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState) // 스크롤 가능하게 만들기
            ) {
                //프로필 정보
                Box(
                    modifier = Modifier.background(color = Color.White)
                ) {
                    Column {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 19.dp, end = 16.dp, bottom = 12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_profile),
                                contentDescription = null,
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(end = 14.dp, bottom = 5.dp)
                            )
                            Column(
                                verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top),
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_level),
                                    contentDescription = null
                                )
                                Text(
                                    text = "김두둑",
                                    style = ComposePracticeTheme.typography.Bn1_b.copy(color = ComposePracticeTheme.colors.black)
                                )
                            }
                            Spacer(modifier = Modifier.weight(1f))
                            Box(
                                modifier = Modifier
                                    .border(
                                        width = 1.dp,
                                        color = ComposePracticeTheme.colors.g1,
                                        shape = RoundedCornerShape(size = 32.dp)
                                    )
                                    .background(
                                        color = Color.White,
                                        RoundedCornerShape(size = 32.dp)
                                    )
                                    .padding(horizontal = 12.dp, vertical = 8.dp)
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_dotori),
                                        contentDescription = null,
                                        modifier = Modifier.size(38.dp)
                                    )
                                    Text(
                                        text = "20",
                                        style = ComposePracticeTheme.typography.Br1_sb.copy(color = ComposePracticeTheme.colors.black),
                                        modifier = Modifier.padding(end = 8.dp)
                                    )
                                }
                            }
                        }

                        //팔로워&팔로잉 정보
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 8.dp),
                            horizontalArrangement = Arrangement.SpaceEvenly
                        ) {
                            Column(
                                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Text(
                                    text = "팔로워",
                                    style = ComposePracticeTheme.typography.Caption1_r.copy(color = ComposePracticeTheme.colors.g4)
                                )
                                Text(
                                    text = "0",
                                    style = ComposePracticeTheme.typography.Ln1_m.copy(color = ComposePracticeTheme.colors.g6)
                                )
                            }
                            Column(
                                verticalArrangement = Arrangement.spacedBy(2.dp, Alignment.Top),
                                horizontalAlignment = Alignment.CenterHorizontally,
                            ) {
                                Text(
                                    text = "팔로잉",
                                    style = ComposePracticeTheme.typography.Caption1_r.copy(color = ComposePracticeTheme.colors.g4)
                                )
                                Text(
                                    text = "0",
                                    style = ComposePracticeTheme.typography.Ln1_m.copy(color = ComposePracticeTheme.colors.g6)
                                )
                            }
                        }
                    }
                }

                //프로필 아래
                Box(
                    modifier = Modifier
                        .background(ComposePracticeTheme.colors.g1)
                        .padding(top = 32.dp)
                ) {
                    Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {
                        //목표 달성률
                        myGoal()

                        Spacer(modifier = Modifier.height(43.6.dp))

                        //나의 아카이브
                        Text(
                            text = "나의 아카이브",
                            style = ComposePracticeTheme.typography.Headline2_b.copy(color = ComposePracticeTheme.colors.g6),
                            modifier = Modifier.padding(bottom = 12.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.iv_banner),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 12.dp),
                            contentScale = ContentScale.Crop
                        )
                        myArchives()
                        //마이페이지 버튼
                        myPageButton()

                    }
                }

            }
        }
    }
}

@Composable
private fun myGoal() {
    Text(
        text = "목표 달성률",
        style = ComposePracticeTheme.typography.Headline2_b.copy(color = ComposePracticeTheme.colors.g6),
        modifier = Modifier.padding(bottom = 12.dp)
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(size = 10.dp))
            .padding(vertical = 20.dp, horizontal = 15.dp)

    ) {
        Column {
            Row {
                Text(
                    text = "일주일 중에 ",
                    style = ComposePracticeTheme.typography.Lr1_sb.copy(color = ComposePracticeTheme.colors.g5)
                )
                //읽은 뉴스 세기
                Text(
                    text = "1",
                    style = ComposePracticeTheme.typography.Lr1_sb.copy(color = ComposePracticeTheme.colors.v6)
                )
                Text(
                    text = "일 동안 뉴스를 읽었어요!",
                    style = ComposePracticeTheme.typography.Lr1_sb.copy(color = ComposePracticeTheme.colors.g5)
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                val daysOfWeek = listOf("일", "월", "화", "수", "목", "금", "토")

                daysOfWeek.forEach { day ->
                    Column(
                        modifier = Modifier.weight(1f),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = day,
                            style = ComposePracticeTheme.typography.Label2_r.copy(color = ComposePracticeTheme.colors.g4),
                        )
                        Spacer(modifier = Modifier.height(13.dp))
                        Image(
                            painter = painterResource(id = R.drawable.ic_week_cloud_unfill),
                            contentDescription = null,
                        )
                    }
                }
            }
        }

    }
}

@Composable
private fun myArchives() {
    //1열
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp) // 두 Box 사이에 간격을 추가
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .background(Color.White, RoundedCornerShape(10.dp))
                .padding(vertical = 16.dp, horizontal = 16.dp)
        ) {
            Row {
                Column {
                    Text(
                        text = "글로벌",
                        style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
                    )
                    Row {
                        Text(
                            text = "10",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.v6)
                        )
                        Text(
                            text = "개",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.g5)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.ic_global),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .background(Color.White, RoundedCornerShape(10.dp))
                .padding(vertical = 16.dp, horizontal = 16.dp)
        ) {
            Row {
                Column {
                    Text(
                        text = "금융",
                        style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
                    )
                    Row {
                        Text(
                            text = "10",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.v6)
                        )
                        Text(
                            text = "개",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.g5)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.ic_money),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp)
                )
            }
        }
    }
    //2열
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp) // 두 Box 사이에 간격을 추가
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .background(Color.White, RoundedCornerShape(10.dp))
                .padding(vertical = 16.dp, horizontal = 16.dp)
        ) {
            Row {
                Column {
                    Text(
                        text = "증권",
                        style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
                    )
                    Row {
                        Text(
                            text = "10",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.v6)
                        )
                        Text(
                            text = "개",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.g5)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.ic_bank),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .background(Color.White, RoundedCornerShape(10.dp))
                .padding(vertical = 16.dp, horizontal = 16.dp)
        ) {
            Row {
                Column {
                    Text(
                        text = "부동산",
                        style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
                    )
                    Row {
                        Text(
                            text = "10",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.v6)
                        )
                        Text(
                            text = "개",
                            style = ComposePracticeTheme.typography.Caption2_m.copy(color = ComposePracticeTheme.colors.g5)
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
                Image(
                    painter = painterResource(id = R.drawable.ic_bank_statement),
                    contentDescription = null,
                    modifier = Modifier.size(38.dp)
                )
            }
        }
    }
}

@Composable
private fun myPageButton() {
    Box(
        modifier = Modifier
            .padding(bottom = 12.dp)
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(vertical = 13.dp, horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "나의 단어장",
                style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null,
                modifier = Modifier.size(38.dp)
            )
        }
    }
    Box(
        modifier = Modifier
            .padding(bottom = 12.dp)
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(vertical = 13.dp, horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "나의 생각 모아보기",
                style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null,
                modifier = Modifier.size(38.dp)
            )
        }
    }
    Box(
        modifier = Modifier
            .padding(bottom = 22.dp)
            .background(Color.White, RoundedCornerShape(10.dp))
            .padding(vertical = 13.dp, horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = "좋아요한 생각 모아보기",
                style = ComposePracticeTheme.typography.Bn2_sb.copy(color = ComposePracticeTheme.colors.black)
            )
            Spacer(modifier = Modifier.weight(1f))
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_right),
                contentDescription = null,
                modifier = Modifier.size(38.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
