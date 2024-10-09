package com.example.todo_app

import SearchPage
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo_app.screen.DisplayTodo
import com.example.todo_app.ui.theme.Todo_AppTheme
import com.example.todo_app.viewmodel.TodoViewModel
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val todoViewModel = TodoViewModel() // Use the ViewModel with proper lifecycle
            Todo_AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    // Wrapping both SearchPage and DisplayTodo in a Column

                        // SearchPage at the top
                        SearchPage(modifier = Modifier.fillMaxWidth().padding(16.dp).padding(innerPadding))


                        Spacer(modifier = Modifier.height(16.dp)) // Adjust height as needed


                        DisplayTodo(todoviewmodel = todoViewModel, modifier = Modifier.fillMaxWidth()
                        )
                    }

            }
        }
    }
}

