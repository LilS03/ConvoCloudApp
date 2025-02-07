package com.example.core.data.database.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserDbModel(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nickname: String,
    val password: String,
    val confirmWord: String
)