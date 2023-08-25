package com.example.firstcomposeprodject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import com.example.firstcomposeprodject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeprodject.ui.theme.InstagramProfileCard
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test(viewModel = viewModel)
//            FirstComposeProjectTheme {
////                MainScreen(viewModel)
//                                }
        }
    }
}

@Composable
private fun Test(viewModel: MainViewModel) {
    FirstComposeProjectTheme {
        Box(
            modifier = Modifier.fillMaxSize(),
        ) {
            val models = viewModel.models.observeAsState(listOf())
            val scope = rememberCoroutineScope()
            val lazyListState = rememberLazyListState()
            LazyColumn(
                state = lazyListState
            )
            {
                items(models.value) {
                    InstagramProfileCard(
                        model = it,
                        onFollowButtonClickListener = {
                            viewModel.changeFollowingStatus(it)
                        }
                    )
                }
            }
            FloatingActionButton(onClick = {
                scope.launch {
                    lazyListState.scrollToItem(0)
                }
            })
            {
            }
        }
    }
}