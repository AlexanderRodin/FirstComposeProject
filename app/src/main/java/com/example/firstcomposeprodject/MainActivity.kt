package com.example.firstcomposeprodject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import com.example.firstcomposeprodject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeprodject.ui.theme.InstagramProfileCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        setContent {
            FirstComposeProjectTheme {
                InstagramProfileCard(viewModel)
            }
        }
    }
}