package com.example.features.authentication.registration.domain.repository

import com.example.core.data.model.User
import kotlinx.coroutines.flow.Flow

interface AddUserRepository {
    fun addUser(nickname: String, password: String, confirmWord: String): Flow<User?>
}