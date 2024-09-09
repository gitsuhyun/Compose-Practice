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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_practice.R
import com.example.compose_practice.ui.theme.ComposePracticeTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlusCompleteScreen() {
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
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = ComposePracticeTheme.colors.v1)
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = ComposePracticeTheme.colors.v1)
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 22.dp),
                verticalArrangement = Arrangement.spacedBy(5.4.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(modifier = Modifier.height(41.dp))
                //말풍선
                Box(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(size = 30.dp)
                        )
                        .shadow(
                            elevation = 17.5.dp,
                            spotColor = Color(0xE8FFFFFF),
                            ambientColor = Color(0xE8FFFFFF)
                        )
                        .border(width = 1.dp, color = ComposePracticeTheme.colors.v2)
                        .padding(horizontal = 25.dp, vertical = 27.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Row {
                            Text(
                                text = "생각 구름",
                                style = ComposePracticeTheme.typography.Heading1_b.copy(
                                    color = ComposePracticeTheme.colors.v6,
                                    textAlign = TextAlign.Center
                                )
                            )
                            Text(
                                text = "을 완성했어요!",
                                style = ComposePracticeTheme.typography.Heading1_b.copy(
                                    color = ComposePracticeTheme.colors.black,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "완성된 생각구름을 구경해볼까요?",
                            style = ComposePracticeTheme.typography.Lr1_m.copy(
                                color = ComposePracticeTheme.colors.g5,
                                textAlign = TextAlign.Center
                            )
                        )
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.iv_shadow_cloud),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.weight(1f))
                //이동 버튼
                nextButton()
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
            text = "구경하기",
            style = ComposePracticeTheme.typography.Bn1_b.copy(color = Color.White)
        )
    }
}

@Preview
@Composable
fun PlusCompletePreview() {
    PlusCompleteScreen()
}