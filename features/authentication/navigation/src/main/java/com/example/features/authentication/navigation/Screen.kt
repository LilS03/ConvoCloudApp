package com.example.features.authentication.navigation

sealed class Screen(val route: String) {
    data object RegistrationScreen: Screen("registration")
}