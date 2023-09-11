package com.example.firstcomposeprodject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation

fun NavGraphBuilder.homeScreenNavGraph(
    newsFeedScreenContent: @Composable () -> Unit,
    commentsScreenContent: @Composable () -> Unit
) {
    navigation(
        startDestination = Screen.NewsFeed.rout,
        route = Screen.Home.rout
    ) {
        composable(Screen.NewsFeed.rout) {
            newsFeedScreenContent()
        }
        composable(Screen.Comments.rout) {
            commentsScreenContent()
        }
    }
}