package com.example.simplemvvmexamplewithjetpackcompose.start

import androidx.compose.runtime.Composable

@Composable
fun StartScreenRoute(
    OnSignInClicked :() -> Unit,
    OnSignUpClicked : () -> Unit
){
    StartScreen(OnSignInClick = OnSignInClicked)
}