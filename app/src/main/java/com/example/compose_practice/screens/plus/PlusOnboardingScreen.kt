package com.example.compose_practice.screens.plus

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun PlusOnboardingScreen() {
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
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 26.dp),
                verticalArrangement = Arrangement.spacedBy(5.4.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                //설명
                descriptionPlus()
                Spacer(modifier = Modifier.height(20.dp))
                //indicate
                Text(
                    text = "indicate",
                    style = ComposePracticeTheme.typography.Ln1_sb.copy(color = ComposePracticeTheme.colors.black)
                )
                Spacer(modifier = Modifier.weight(1f))
                //이동 버튼
                nextButton()
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}

@Composable
private fun descriptionPlus() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = ComposePracticeTheme.colors.v2,
                shape = RoundedCornerShape(size = 10.dp)
            )
            .padding(start = 45.dp, top = 72.dp, end = 45.dp, bottom = 115.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(size = 10.dp)
                    )
                    .shadow(
                        elevation = 15.5.dp,
                        spotColor = Color(0xE8FFFFFF),
                        ambientColor = Color(0xE8FFFFFF)
                    )
                    .border(width = 1.dp, color = ComposePracticeTheme.colors.v2)
                    .padding(horizontal = 15.dp, vertical = 12.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "생각더하기가 처음이신 \n여러분께 어떻게 생각을 더할지\n도와드릴게요!",
                    style = ComposePracticeTheme.typography.Lr1_m.copy(
                        color = ComposePracticeTheme.colors.g6,
                        textAlign = TextAlign.Center
                    )
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_plus_say),
                contentDescription = "말풍선 역삼각형",
            )
            Image(
                painter = painterResource(id = R.drawable.iv_excited_cloud),
                contentDescription = "구름 이미지",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier.size(width = 238.dp, height = 177.dp)
            )

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
            text = "다음",
            style = ComposePracticeTheme.typography.Bn1_b.copy(color = Color.White)
        )
    }
}

@Preview
@Composable
fun PlusOnboardingPreview() {
    PlusOnboardingScreen()
}