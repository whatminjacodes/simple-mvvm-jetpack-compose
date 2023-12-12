package com.example.simplemvvmexamplewithjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplemvvmexamplewithjetpackcompose.Destinations.WELCOME_ROUTE
import com.example.simplemvvmexamplewithjetpackcompose.start.WelcomeRoute

object Destinations {
    const val SIGN_IN = "signin"
    const val SIGN_UP = "signup"
    const val WELCOME_ROUTE = "welcome"
    const val DASHBOARD_ROUTE = "dashboard/{email}"
}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = WELCOME_ROUTE) {
        composable(WELCOME_ROUTE) {
            WelcomeRoute(OnSignInClicked = {
                //navController.navigate(SIGN_IN)
            }, OnSignUpClicked = {
                //navController.navigate(SIGN_UP)
            })
        }
    }
}