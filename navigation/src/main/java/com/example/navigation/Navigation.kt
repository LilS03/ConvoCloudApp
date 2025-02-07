package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.features.authentication.navigation.AuthNav

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RegistrationScreen.route) {
        composable(route = Screen.RegistrationScreen.route){
            AuthNav()
        }
    }
}