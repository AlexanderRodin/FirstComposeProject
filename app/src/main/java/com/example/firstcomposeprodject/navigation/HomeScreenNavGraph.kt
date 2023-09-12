package com.example.firstcomposeprodject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.firstcomposeprodject.domain.FeedPost
import com.google.gson.Gson

fun NavGraphBuilder.homeScreenNavGraph(
    newsFeedScreenContent: @Composable () -> Unit,
    commentsScreenContent: @Composable (feedPost: FeedPost) -> Unit
) {
    navigation(
        startDestination = Screen.NewsFeed.rout,
        route = Screen.Home.rout
    ) {
        composable(Screen.NewsFeed.rout) {
            newsFeedScreenContent()
        }
        composable(
            route = Screen.Comments.rout,
            arguments = listOf(
                navArgument(Screen.KEY_FEED_POST) {
                    type = NavType.StringType
                }
            )
        ) {
            val feedPostJson = it.arguments?.getString(Screen.KEY_FEED_POST) ?: ""
            val feedPost = Gson().fromJson(feedPostJson, FeedPost::class.java)
            commentsScreenContent(feedPost)
        }
    }
}