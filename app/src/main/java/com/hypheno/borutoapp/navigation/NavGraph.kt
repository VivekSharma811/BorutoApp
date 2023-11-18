package com.hypheno.borutoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.google.accompanist.pager.ExperimentalPagerApi
import com.hypheno.borutoapp.presentation.screens.details.DetailsScreen
import com.hypheno.borutoapp.presentation.screens.home.HomeScreen
import com.hypheno.borutoapp.presentation.screens.search.SearchScreen
import com.hypheno.borutoapp.presentation.screens.splash.SplashScreen
import com.hypheno.borutoapp.presentation.screens.welcome.WelcomeScreen
import com.hypheno.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENT_KEY) {
                type = NavType.IntType
            })
        ) {
            DetailsScreen(navController = navController)
        }
        composable(route = Screen.Search.route) {
            SearchScreen(navController)
        }
    }
}