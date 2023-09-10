package com.example.firstcomposeprodject.ui.theme.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.DismissDirection
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SwipeToDismiss
import androidx.compose.material3.rememberDismissState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.firstcomposeprodject.MainViewModel
import com.example.firstcomposeprodject.domain.PostComment
import com.example.firstcomposeprodject.ui.theme.CommentsScreen
import com.example.firstcomposeprodject.ui.theme.PostCard

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    viewModel: MainViewModel,
    paddingValues: PaddingValues
) {
    val feedPosts = viewModel.feedPosts.observeAsState(listOf())

    val comments = mutableListOf<PostComment>().apply {
        repeat(20){
            add(
                PostComment(id = it)
            )
        }
    }

    if (feedPosts.value.isNotEmpty()){
        CommentsScreen(feedPost = feedPosts.value.get(0), comments = comments)
    }
    


//    LazyColumn(
//        modifier = androidx.compose.ui.Modifier.padding(paddingValues),
//        contentPadding = PaddingValues(
//            top = 16.dp,
//            start = 8.dp,
//            end = 8.dp,
//            bottom = 76.dp,
//        ),
//        verticalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        items(feedPosts.value, key = { it.id }) { feedPost ->
//            val dismissState = rememberDismissState()
//            if (dismissState.isDismissed(DismissDirection.EndToStart)) {
//                viewModel.remove(feedPost)
//            }
//            SwipeToDismiss(
//                modifier = Modifier.animateItemPlacement(),
//                state = dismissState,
//                directions = setOf(DismissDirection.EndToStart),
//                background = {},
//                dismissContent = {
//                    PostCard(
//                        feedPost = feedPost,
//                        onLikeClickListener = { statisticItem ->
//                            viewModel.updateCount(feedPost, statisticItem)
//                        },
//                        onShareClickListener = { statisticItem ->
//                            viewModel.updateCount(feedPost, statisticItem)
//                        },
//                        onViewsClickListener = { statisticItem ->
//                            viewModel.updateCount(feedPost, statisticItem)
//                        },
//                        onCommentClickListener = { statisticItem ->
//                            viewModel.updateCount(feedPost, statisticItem)
//                        }
//                    )
//                })
//        }
//    }
}