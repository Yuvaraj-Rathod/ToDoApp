package com.example.todo_app.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.todo_app.entity.Todo

@Dao
interface TodoDao {

    @Query("SELECT * FROM TODO")
    fun getAllData() : LiveData<List<Todo>>

    @Insert
    fun addTodo(todo : Todo)

    @Query("DELETE FROM TODO WHERE id = :id")
    fun deleteTodo(id : Int)

}