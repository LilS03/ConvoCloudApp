package com.example.core.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.core.data.database.model.UserDbModel
import com.example.core.data.model.User

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addUser(user: UserDbModel)

    @Delete
    fun deleteUser(user: User): Boolean

    @Query("SELECT * FROM user WHERE id = :userId")
    fun getUser(userId: Int): User

    @Query("UPDATE user SET nickname = :nickname WHERE id = :userId")
    fun updateNickname(userId: Int, nickname: String): Boolean

    @Query("UPDATE user SET password = :password WHERE id = :userId")
    fun updatePassword(userId: Int, password: String): Boolean

    @Query("UPDATE user SET confirmWord = :confirmWord WHERE id = :userId")
    fun updateConfirmWord(userId: Int, confirmWord: String): Boolean
}