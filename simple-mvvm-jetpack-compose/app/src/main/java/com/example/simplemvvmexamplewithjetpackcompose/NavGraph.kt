package com.example.simplemvvmexamplewithjetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplemvvmexamplewithjetpackcompose.Destinations.MAIN_SCREEN_ROUTE
import com.example.simplemvvmexamplewithjetpackcompose.Destinations.START_SCREEN_ROUTE
import com.example.simplemvvmexamplewithjetpackcompose.main.MainScreenRoute
import com.example.simplemvvmexamplewithjetpackcompose.start.StartScreenRoute

object Destinations {
    const val START_SCREEN_ROUTE = "welcome"
    const val MAIN_SCREEN_ROUTE = "first"
}
@Composable
fun NavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = START_SCREEN_ROUTE) {
        composable(START_SCREEN_ROUTE) {
            StartScreenRoute(OnSignInClicked = {
                navController.navigate(MAIN_SCREEN_ROUTE)
            }, OnSignUpClicked = {
                navController.navigate(MAIN_SCREEN_ROUTE)
            })
        }

        composable(MAIN_SCREEN_ROUTE){
            val message  = "message from start screen"
            MainScreenRoute(messageFromStart = message!!)
        }
    }
}