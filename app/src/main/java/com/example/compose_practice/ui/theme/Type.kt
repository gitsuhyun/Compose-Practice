package com.example.compose_practice.ui.theme


import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.compose_practice.R

@Immutable
data class GoodMoney(
    val Title1_r: TextStyle,
    val Title1_m: TextStyle,
    val Title1_sb: TextStyle,
    val Title1_b : TextStyle,
    val Title2_r : TextStyle,
    val Title2_m : TextStyle,
    val Title2_sb : TextStyle,
    val Title2_b : TextStyle,
    val Title3_r : TextStyle,
    val Title3_m : TextStyle,
    val Title3_sb : TextStyle,
    val Title3_b : TextStyle,
    val Heading1_r : TextStyle,
    val Heading1_m : TextStyle,
    val Heading1_sb : TextStyle,
    val Heading1_b : TextStyle,
    val Heading2_r : TextStyle,
    val Heading2_m : TextStyle,
    val Heading2_sb : TextStyle,
    val Heading2_b : TextStyle,
    val Headline1_r : TextStyle,
    val Headline1_m : TextStyle,
    val Headline1_sb : TextStyle,
    val Headline1_b : TextStyle,
    val Headline2_r : TextStyle,
    val Headline2_m : TextStyle,
    val Headline2_sb : TextStyle,
    val Headline2_b : TextStyle,
    val Bn1_r : TextStyle,
    val Bn1_m : TextStyle,
    val Bn1_sb : TextStyle,
    val Bn1_b : TextStyle,
    val Bn2_r : TextStyle,
    val Bn2_m : TextStyle,
    val Bn2_sb : TextStyle,
    val Bn2_b : TextStyle,
    val Br1_r : TextStyle,
    val Br1_m : TextStyle,
    val Br1_sb : TextStyle,
    val Br1_b : TextStyle,
    val Br2_r : TextStyle,
    val Caption2_b: TextStyle,
    val Caption2_sb: TextStyle,
    val Caption2_m: TextStyle,
    val Caption2_r: TextStyle,
    val Caption1_b: TextStyle,
    val Caption1_sb: TextStyle,
    val Caption1_m: TextStyle,
    val Caption1_r: TextStyle,
    val Label2_b: TextStyle,
    val Label2_sb: TextStyle,
    val Label2_m: TextStyle,
    val Label2_r: TextStyle,
    val Lr1_b: TextStyle,
    val Lr1_sb: TextStyle,
    val Lr1_m: TextStyle,
    val Lr1_r: TextStyle,
    val Ln1_b: TextStyle,
    val Ln1_sb: TextStyle,
    val Ln1_m: TextStyle,
    val Ln1_r: TextStyle,
    val Br2_b: TextStyle,
    val Br2_sb: TextStyle,
    val Br2_m: TextStyle,
)

val pretendard = FontFamily(
    Font(R.font.pretendard_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.pretendard_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.pretendard_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.pretendard_semi_bold, FontWeight.SemiBold, FontStyle.Normal)
)

val Typography = GoodMoney(
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
    fontSize = 24.sp,
   fontWeight = FontWeight.Normal,
    fontFamily = pretendard),
    Heading1_m = TextStyle(
    fontSize = 24.sp,
    fontWeight = FontWeight.Medium,
    fontFamily= pretendard),
    Heading1_sb = TextStyle(
    fontSize = 24.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = pretendard),
    Heading1_b = TextStyle(
    fontSize = 24.sp,
   fontWeight = FontWeight.Bold,
    fontFamily = pretendard),
    Heading2_r = TextStyle(
    fontSize= 22.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = pretendard),
    Heading2_m = TextStyle(
    fontSize = 22.sp,
    fontWeight = FontWeight.Medium,
    fontFamily = pretendard),
    Heading2_sb = TextStyle(
    fontSize = 22.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = pretendard),
    Heading2_b = TextStyle(
    fontSize = 22.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = pretendard),
    Headline1_r = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = pretendard),
    Headline1_m = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Medium,
    fontFamily = pretendard),
    Headline1_sb = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily= pretendard),
    Headline1_b = TextStyle(
    fontSize = 20.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = pretendard),
    Headline2_r = TextStyle(
    fontSize = 19.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = pretendard),
    Headline2_m = TextStyle(
    fontSize = 19.sp,
    fontWeight = FontWeight.Medium,
    fontFamily = pretendard),
    Headline2_sb = TextStyle(
    fontSize = 19.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = pretendard),
    Headline2_b = TextStyle(
    fontSize = 19.sp,
    fontWeight = FontWeight.Bold,
    fontFamily = pretendard),

//Bn -> Body/Normal
    Bn1_r = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.Normal,
    fontFamily = pretendard),
    Bn1_m = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.Medium,
    fontFamily = pretendard),
    Bn1_sb = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.SemiBold,
    fontFamily = pretendard),
    Bn1_b = TextStyle(
    fontSize = 18.sp,
    fontWeight = FontWeight.Bold,
    fontFamily= pretendard),
    Bn2_r = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Bn2_m = TextStyle(
    fontSize= 17.sp,
    fontWeight = FontWeight.Medium,
    fontFamily = pretendard),
    Bn2_sb = TextStyle(
        fontSize = 17.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Bn2_b = TextStyle(
        fontSize= 17.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Br1_r  = TextStyle(
        fontSize= 18.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Br1_m  = TextStyle(
        fontSize= 18.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Br1_sb  = TextStyle(
        fontSize= 18.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Br1_b  = TextStyle(
        fontSize= 18.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Br2_r  = TextStyle(
        fontSize= 17.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Br2_m  = TextStyle(
        fontSize= 17.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Br2_sb  = TextStyle(
        fontSize= 17.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Br2_b  = TextStyle(
        fontSize= 17.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Ln1_r  = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Ln1_m  = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Ln1_sb  = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Ln1_b  = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Lr1_r = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Lr1_m = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Lr1_sb = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Lr1_b = TextStyle(
        fontSize= 16.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Label2_r   = TextStyle(
        fontSize= 15.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Label2_m   = TextStyle(
        fontSize= 15.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Label2_sb   = TextStyle(
        fontSize= 15.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Label2_b   = TextStyle(
        fontSize= 15.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Caption1_r  = TextStyle(
        fontSize= 14.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Caption1_m  = TextStyle(
        fontSize= 14.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Caption1_sb = TextStyle(
        fontSize= 14.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Caption2_r = TextStyle(
        fontSize= 13.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = pretendard),
    Caption2_m = TextStyle(
        fontSize= 13.sp,
        fontWeight = FontWeight.Medium,
        fontFamily = pretendard),
    Caption2_sb = TextStyle(
        fontSize= 13.sp,
        fontWeight = FontWeight.SemiBold,
        fontFamily = pretendard),
    Caption2_b = TextStyle(
        fontSize= 13.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard),
    Caption1_b = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = pretendard
    )
)

val LocalTypography = staticCompositionLocalOf { Typography }

