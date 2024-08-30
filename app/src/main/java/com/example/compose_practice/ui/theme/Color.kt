package com.example.compose_practice.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


class AppColors(
    //violet
    val v1: Color = Color(0xFFEAE9FE),
    val v2: Color = Color(0xFFD7D7FD),
    val v3: Color = Color(0xFFB9B6FC),
    val v4: Color = Color(0xFF968DF8),
    val v5: Color = Color(0xFF735EF4),
    val v6: Color = Color(0xFF552FE9),
    val v7: Color = Color(0xFF522BD6),
    val v8: Color = Color(0xFF4323B4),
    val v9: Color = Color(0xFF391F93),

    //yellow
    val y1: Color = Color(0xFFFFF9E9),
    val y2: Color = Color(0xFFFFECBC),
    val y3: Color = Color(0xFFFEDF90),
    val y4: Color = Color(0xFFFED363),
    val y5: Color = Color(0xFFFEC637),
    val y6: Color = Color(0xFFEFAC01),
    val y7: Color = Color(0xFFAB7B01),
    val y8: Color = Color(0xFF896201),
    val y9: Color = Color(0xFF664A01),

    //grey
    val g1: Color = Color(0xFFF5F5F9),
    val g2: Color = Color(0xFFE9E9EE),
    val g3: Color = Color(0xFFC6C6D0),
    val g4: Color = Color(0xFF9090A0),
    val g5: Color = Color(0xFF626273),
    val g6: Color = Color(0xFF464656),

    //black
    val black: Color = Color(0xFF212121),

    //white
    val white: Color = Color(0xFFFFFFFF),
)

val LocalColors = staticCompositionLocalOf { AppColors() }
