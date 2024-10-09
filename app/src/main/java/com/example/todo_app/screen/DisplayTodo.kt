package com.example.todo_app.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.todo_app.viewmodel.TodoViewModel


@Composable
fun DisplayTodo( todoviewmodel : TodoViewModel,modifier: Modifier = Modifier) {

    val todos = todoviewmodel._todoList.observeAsState(emptyList())
    LazyColumn (modifier = Modifier.padding(top = 160.dp)){
        items(todos.value){
                item -> TodoItem(todo = item,todoviewmodel)
        }
    }
}