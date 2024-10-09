package com.example.todo_app.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.todo_app.dao.TodoDao
import com.example.todo_app.entity.Todo


@Database(entities = [Todo :: class], version = 1)
@TypeConverters(Converters::class)
abstract class TodoDataBase : RoomDatabase(){

    companion object {
        const val NAME = "Todo_DB"
    }
    abstract fun getTodoDao() : TodoDao
}