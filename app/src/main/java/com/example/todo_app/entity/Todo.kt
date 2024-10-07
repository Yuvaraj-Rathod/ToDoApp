package com.example.todo_app.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true) val id : Int = 0,
    val title : String,
    val createdAt : Date
)
