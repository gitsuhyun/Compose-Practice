package com.example.compose_practice.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

object ComposePracticeTheme {
    val colors: AppColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current

    val typography: GoodMoney
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current

}