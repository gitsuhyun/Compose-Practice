package com.example.compose_practice.screens

sealed class Screens (val screen: String){
    object Home: Screens("home")
    object Plus: Screens("plus") {
        object PlusOnboarding: Screens("plusOnboarding")
    }
    object Share: Screens("share")
    object Profile: Screens("profile")
}