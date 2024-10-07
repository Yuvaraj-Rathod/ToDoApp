package com.example.todo_app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todo_app.dao.TodoDao
import com.example.todo_app.entity.Todo


@Database(entities = [Todo :: class], version = 1)
abstract class TodoDataBase : RoomDatabase(){

    companion object {
        const val NAME = "Todo_DB"
    }
    abstract fun getTodoDao() : TodoDao
}