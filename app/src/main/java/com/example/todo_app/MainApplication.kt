package com.example.todo_app

import android.app.Application
import androidx.room.Room
import com.example.todo_app.db.TodoDataBase

class MainApplication : Application() {

    companion object{
        lateinit var todoDataBase: TodoDataBase
    }

    override fun onCreate() {
        super.onCreate()
       todoDataBase=  Room.databaseBuilder(
            applicationContext,
            TodoDataBase::class.java,
            TodoDataBase.NAME
        ).build()
    }
}