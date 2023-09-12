package com.example.firstcomposeprodject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.firstcomposeprodject.domain.FeedPost

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
                navArgument(Screen.KEY_FEED_POST_ID){
                    type = NavType.IntType
                },
                navArgument(Screen.KEY_CONTENT_TEXT){
                    type = NavType.StringType
                }
            )
        ) {
            val feedPostId = it.arguments?.getInt(Screen.KEY_FEED_POST_ID) ?: 0
            val contentText = it.arguments?.getString(Screen.KEY_CONTENT_TEXT) ?: ""
            commentsScreenContent(
                FeedPost(
                    id = feedPostId,
                    contentText = contentText
                )
            )
        }
    }
}