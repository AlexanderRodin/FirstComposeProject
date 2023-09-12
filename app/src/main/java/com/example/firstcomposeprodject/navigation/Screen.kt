package com.example.firstcomposeprodject.navigation

import android.net.Uri
import com.example.firstcomposeprodject.domain.FeedPost

sealed class Screen(
    val rout: String
){
    object NewsFeed: Screen(ROUTE_NEWS_FEED)
    object Favourite: Screen(ROUTE_FAVOURITE)
    object Profile: Screen(ROUTE_PROFILE)
    object Home:Screen(ROOT_HOME)
    object Comments:Screen(ROOT_COMMENTS) {

        private const val ROUTE_FOR_ARGS = "comments"
        fun getRouteWithArgs(feedPost: FeedPost): String{
            return "$ROUTE_FOR_ARGS/${feedPost.id}/${feedPost.contentText.encode()}"
        }
    }

    companion object{
        const val KEY_FEED_POST_ID = "feed_post_id"
        const val KEY_CONTENT_TEXT = "content_text"
        const val KEY_FEED_POST = "feed_post"

        const val ROOT_HOME = "home"
        const val ROOT_COMMENTS = "comments/{$KEY_FEED_POST_ID}/{$KEY_CONTENT_TEXT}"
        const val ROUTE_NEWS_FEED = "news_feed"
        const val ROUTE_FAVOURITE = "favourite"
        const val ROUTE_PROFILE = "profile"
    }
}

fun String.encode(): String{
    return Uri.encode(this)
}