package com.example.todo_app.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.todo_app.MainApplication
import com.example.todo_app.dao.TodoDao
import com.example.todo_app.entity.Todo
import java.time.Instant
import java.util.Date

class TodoViewModel : ViewModel() {
     val todoDao = MainApplication.todoDataBase.getTodoDao()
     val _todoList: LiveData<List<Todo>> = todoDao.getAllData()

    fun addData(title : String){
        todoDao.addTodo(Todo(title = title,createdAt = Date.from(Instant.now())))
    }

    fun deleteTodo(id : Int){
        todoDao.deleteTodo(id)
    }
}