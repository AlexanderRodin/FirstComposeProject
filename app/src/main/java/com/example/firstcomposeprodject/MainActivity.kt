package com.example.firstcomposeprodject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.firstcomposeprodject.ui.theme.FirstComposeProjectTheme
import com.example.firstcomposeprodject.ui.theme.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstComposeProjectTheme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TestFour() {
    Scaffold(

        topBar = {
            TopAppBar(
                title = { Text(text = "Title text") },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = { Icon(Icons.Filled.Favorite, null) },
                    label = { Text("Favourite") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = { Icon(Icons.Outlined.Edit, null) },
                    label = { Text("Edit") }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon = { Icon(Icons.Outlined.Delete, null) },
                    label = { Text("Delete") }
                )
            }
        },

        ) {
        Text(
            modifier = Modifier.padding(it),
            text = "This is scaffol content"
        )
    }
}


@Composable
private fun TestText() {
    OutlinedButton(onClick = { }) {
        Text(text = "Simple Button")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun TestTextTwo() {
    TextField(
        value = "",
        onValueChange = {},
        label = { Text(text = "label") },
        singleLine = true
    )
}

@Composable
private fun TestTextTree() {
    AlertDialog(
        onDismissRequest = {},
        title = { Text(text = "Are you sure?") },
        text = { Text(text = "") },
        confirmButton = {
            TextButton(onClick = { }) {
                Text(text = "Yes")
            }
        },
        dismissButton = {
            TextButton(onClick = {}) {
                Text(text = "No")
            }
        }
    )
}