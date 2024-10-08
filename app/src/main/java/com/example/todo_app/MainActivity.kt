package com.example.todo_app

import DisplayTodo
import SearchPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo_app.ui.theme.Todo_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Todo_AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                          SearchPage(modifier = Modifier.padding(innerPadding))
                    Spacer(modifier = Modifier.height(20.dp))
                           DisplayTodo()
                }
            }
        }
    }
}
