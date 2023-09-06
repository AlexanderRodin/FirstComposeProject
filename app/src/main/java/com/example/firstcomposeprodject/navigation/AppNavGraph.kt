package com.example.firstcomposeprodject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable

fun AppNavGraph(
    navHostController: NavHostController,
    homeScreenContent: @Composable () -> Unit,
    favouriteScreenContent: @Composable () -> Unit,
    profileScreenContent: @Composable () -> Unit
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.NewsFeed.rout
    ) {
        composable(Screen.NewsFeed.rout) {
            homeScreenContent()
        }
        composable(Screen.Favourite.rout) {
            favouriteScreenContent()
        }
        composable(Screen.Profile.rout) {
            profileScreenContent()
        }
    }
}