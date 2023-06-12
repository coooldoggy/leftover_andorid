package com.coooldoggy.leftover.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.coooldoggy.leftover.ui.route.ScreenRoute

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeftOverApp() {
    val navController = rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize()) { _innerPadding ->
        Box(modifier = Modifier.padding(_innerPadding)) {
            LeftOverNavGraph(navController = navController)
        }
    }
}

@Composable
fun LeftOverNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ScreenRoute.SplashScreen.screenRoute) {
        composable(ScreenRoute.SplashScreen.screenRoute) {
            SplashScreen(navController)
        }
        composable(ScreenRoute.MainScreen.screenRoute) {
            MainScreen()
        }
    }
}
