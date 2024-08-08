package com.example.compose_practice.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.compose_practice.R

val pretendard = FontFamily(
    Font(R.font.pretendard_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.pretendard_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.pretendard_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.pretendard_semi_bold, FontWeight.SemiBold, FontStyle.Normal)
)
// Set of Material typography styles to start with
val Typography = Typography(
    Title1_r = TextStyle(
        fontFamily = pretendard,
        fontSize= 38.sp,
        fontWeight = FontWeight.Normal
    ),
    Title1_m = TextStyle(
        fontSize = 38.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Title1_sb = TextStyle(
        fontSize = 38.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),

    Title1_b = TextStyle(
        fontSize = 38.sp,
        fontWeight = FontWeight.Bold,
        fontFamily= pretendard),
    Title2_r = TextStyle(
        fontSize = 30.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
        Title2_m = TextStyle(
        fontSize = 30.sp,
            fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
        Title2_sb = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            fontFamily = pretendard),
    Title2_b = TextStyle(
        fontSize= 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Title3_r = TextStyle(
        fontSize = 26.sp,
       fontWeight = FontWeight.Normal,
        fontFamily= pretendard),
    Title3_m = TextStyle(
    fontSize = 26.sp,
   fontWeight = FontWeight.Medium,
    fontFamily = pretendard),
    Title3_sb = TextStyle(
        fontSize = 26.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Title3_b = TextStyle(
    fontSize= 26.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = pretendard),
Heading1_r = TextStyle(
fontSize: 24,
//height: 30,
letterSpacing: -0.3104,
fontFamily: 'PretendardRegular');
static const Heading1_m = TextStyle(
fontSize: 24,
//height: 30,
letterSpacing: -0.3104,
fontFamily: 'PretendardMedium');
static const Heading1_sb = TextStyle(
fontSize: 24,
//height: 30,
letterSpacing: -0.3104,
fontFamily: 'PretendardSemi');
static const Heading1_b = TextStyle(
fontSize: 24,
//height: 30,
letterSpacing: -0.3104,
fontFamily: 'PretendardBold');
static const Heading2_r = TextStyle(
fontSize: 22,
//height: 28,
letterSpacing: -0.192,
fontFamily: 'PretendardRegular');
static const Heading2_m = TextStyle(
fontSize: 22,
//height: 28,
letterSpacing: -0.192,
fontFamily: 'PretendardMedium');
static const Heading2_sb = TextStyle(
fontSize: 22,
//height: 28,
letterSpacing: -0.192,
fontFamily: 'PretendardSemi');
static const Heading2_b = TextStyle(
fontSize: 22,
//height: 28,
letterSpacing: -0.192,
fontFamily: 'PretendardBold');
static const Headline1_r = TextStyle(
fontSize: 20,
//height: 26,
letterSpacing: -0.192,
fontFamily: 'PretendardRegular');
static const Headline1_m = TextStyle(
fontSize: 20,
//height: 26,
letterSpacing: -0.192,
fontFamily: 'PretendardMedium');
static const Headline1_sb = TextStyle(
fontSize: 20,
//height: 26,
letterSpacing: -0.192,
fontFamily: 'PretendardSemi');
static const Headline1_b = TextStyle(
fontSize: 20,
//height: 26,
letterSpacing: -0.192,
fontFamily: 'PretendardBold');
static const Headline2_r = TextStyle(
fontSize: 19,
//height: 24,
letterSpacing: 0,
fontFamily: 'PretendardRegular');
static const Headline2_m = TextStyle(
fontSize: 19,
//height: 24,
letterSpacing: 0,
fontFamily: 'PretendardMedium');
static const Headline2_sb = TextStyle(
fontSize: 19,
//height: 24,
letterSpacing: 0,
fontFamily: 'PretendardSemi');
static const Headline2_b = TextStyle(
fontSize: 19,
//height: 24,
letterSpacing: 0,
fontFamily: 'PretendardBold');

//Bn -> Body/Normal
static const Bn1_r = TextStyle(
fontSize: 18,
//height: 24,
letterSpacing: 0.0912,
fontFamily: 'PretendardRegular');
static const Bn1_m = TextStyle(
fontSize: 18,
//height: 24,
letterSpacing: 0.0912,
fontFamily: 'PretendardMedium');
static const Bn1_sb = TextStyle(
fontSize: 18,
//height: 24,
letterSpacing: 0.0912,
fontFamily: 'PretendardSemi');
static const Bn1_b = TextStyle(
fontSize: 18,
//height: 24,
letterSpacing: 0.0912,
fontFamily: 'PretendardBold');
static const Bn2_r = TextStyle(
fontSize: 17,
//height: 22,
letterSpacing: 0.1536,
fontFamily: 'PretendardRegular');
static const Bn2_m = TextStyle(
fontSize: 17,
//height: 22,
letterSpacing: 0.1536,
fontFamily: 'PretendardMedium');
static const Bn2_sb = TextStyle(
fontSize: 17,
//height: 22,
letterSpacing: 0.1536,
fontFamily: 'PretendardSemi');
static const Bn2_b = TextStyle(
fontSize: 17,
//height: 22,
letterSpacing: 0.1536,
fontFamily: 'PretendardBold');

//Br -> Body/Reading
static const Br1_r = TextStyle(
fontSize: 18,
//height: 26,
letterSpacing: 0.0912,
fontFamily: 'PretendardRegular');
static const Br1_m = TextStyle(
fontSize: 18,
//height: 26,
letterSpacing: 0.0912,
fontFamily: 'PretendardMedium');
static const Br1_sb = TextStyle(
fontSize: 18,
//height: 26,
letterSpacing: 0.0912,
fontFamily: 'PretendardSemi');
static const Br1_b = TextStyle(
fontSize: 18,
//height: 26,
letterSpacing: 0.0912,
fontFamily: 'PretendardBold');

static const Br2_r = TextStyle(
fontSize: 17,
//height: 24,
letterSpacing: 0.1536,
fontFamily: 'PretendardRegular');
static const Br2_m = TextStyle(
fontSize: 17,
//height: 24,
letterSpacing: 0.1536,
fontFamily: 'PretendardMedium');
static const Br2_sb = TextStyle(
fontSize: 17,
//height: 24,
letterSpacing: 0.1536,
fontFamily: 'PretendardSemi');
static const Br2_b = TextStyle(
fontSize: 17,
//height: 24,
letterSpacing: 0.1536,
fontFamily: 'PretendardBold');

//Ln -> Label/Normal
static const Ln1_r = TextStyle(
fontSize: 16,
//height: 20,
letterSpacing: 0.232,
fontFamily: 'PretendardRegular');
static const Ln1_m = TextStyle(
fontSize: 16,
//height: 20,
letterSpacing: 0.232,
fontFamily: 'PretendardMedium');
static const Ln1_sb = TextStyle(
fontSize: 16,
//height: 20,
letterSpacing: 0.232,
fontFamily: 'PretendardSemi');
static const Ln1_b = TextStyle(
fontSize: 16,
//height: 20,
letterSpacing: 0.232,
fontFamily: 'PretendardBold');

//Lr -> Label/Reading
static const Lr1_r = TextStyle(
fontSize: 16,
//height: 22,
letterSpacing: 0.232,
fontFamily: 'PretendardRegular');
static const Lr1_m = TextStyle(
fontSize: 16,
//height: 22,
letterSpacing: 0.232,
fontFamily: 'PretendardMedium');
static const Lr1_sb = TextStyle(
fontSize: 16,
//height: 22,
letterSpacing: 0.232,
fontFamily: 'PretendardSemi');
static const Lr1_b = TextStyle(
fontSize: 16,
//height: 22,
letterSpacing: 0.232,
fontFamily: 'PretendardBold');

static const Label2_r = TextStyle(
fontSize: 15,
//height: 18,
letterSpacing: 0.3104,
fontFamily: 'PretendardRegular');
static const Label2_m = TextStyle(
fontSize: 15,
//height: 18,
letterSpacing: 0.3104,
fontFamily: 'PretendardMedium');
static const Label2_sb = TextStyle(
fontSize: 15,
//height: 18,
letterSpacing: 0.3104,
fontFamily: 'PretendardSemi');
static const Label2_b = TextStyle(
fontSize: 15,
//height: 18,
letterSpacing: 0.3104,
fontFamily: 'PretendardBold');

static const Caption1_r = TextStyle(
fontSize: 14,
//height: 16,
letterSpacing: 0.4032,
fontFamily: 'PretendardRegular');
static const Caption1_m = TextStyle(
fontSize: 14,
//height: 16,
letterSpacing: 0.4032,
fontFamily: 'PretendardMedium');
static const Caption1_sb = TextStyle(
fontSize: 14,
//height: 16,
letterSpacing: 0.4032,
fontFamily: 'PretendardSemi');
static const Caption1_b = TextStyle(
fontSize: 14,
//height: 16,
letterSpacing: 0.4032,
fontFamily: 'PretendardBold');


static const Caption2_r = TextStyle(
fontSize: 13,
//height: 14,
letterSpacing: 0.4976,
fontFamily: 'PretendardRegular');
static const Caption2_m = TextStyle(
fontSize: 13,
//height: 14,
letterSpacing: 0.4976,
fontFamily: 'PretendardMedium');
static const Caption2_sb = TextStyle(
fontSize: 13,
//height: 14,
letterSpacing: 0.4976,
fontFamily: 'PretendardSemi');
static const Caption2_b = TextStyle(
fontSize: 13,
//height: 14,
letterSpacing: 0.4976,
fontFamily: 'PretendardBold');

)
