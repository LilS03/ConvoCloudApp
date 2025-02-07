package com.example.navigation

sealed class Screen(val route: String) {
    data object RegistrationScreen: Screen("registration")
}