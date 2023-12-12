package com.example.simplemvvmexamplewithjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplemvvmexamplewithjetpackcompose.Destinations.DASHBOARD_ROUTE
import com.example.simplemvvmexamplewithjetpackcompose.Destinations.WELCOME_ROUTE
import com.example.simplemvvmexamplewithjetpackcompose.main.DashBoardRoute
import com.example.simplemvvmexamplewithjetpackcompose.start.WelcomeRoute

object Destinations {
    const val WELCOME_ROUTE = "welcome"
    const val DASHBOARD_ROUTE = "dashboard/{email}"
}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = WELCOME_ROUTE) {
        composable(WELCOME_ROUTE) {
            WelcomeRoute(OnSignInClicked = {
                navController.navigate(DASHBOARD_ROUTE)
            }, OnSignUpClicked = {
                navController.navigate(DASHBOARD_ROUTE)
            })
        }

        composable(DASHBOARD_ROUTE){
            val message  = "message from start screen"
            DashBoardRoute(messageFromStart = message!!)
        }
    }
}