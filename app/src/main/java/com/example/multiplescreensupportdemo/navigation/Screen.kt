package com.example.multiplescreensupportdemo.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
}