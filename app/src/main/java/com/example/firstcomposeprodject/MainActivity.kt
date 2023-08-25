package com.example.firstcomposeprodject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.firstcomposeprodject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeprodject.ui.theme.InstagramProfileCard
import com.example.firstcomposeprodject.ui.theme.MainScreen

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {
                MainScreen(viewModel)
            }
        }
    }
}