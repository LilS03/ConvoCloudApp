package com.example.features.authentication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.features.authentication.registration.presentation.screen.RegistrationScreen

@Composable
fun AuthNav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RegistrationScreen.route) {
        composable(route = Screen.RegistrationScreen.route){
            RegistrationScreen()
        }
    }
}