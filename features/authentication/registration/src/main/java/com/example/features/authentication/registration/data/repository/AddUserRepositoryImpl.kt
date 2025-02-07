package com.example.features.authentication.registration.data.repository

import com.example.core.data.database.dao.UserDao
import com.example.core.data.database.model.UserDbModel
import com.example.core.data.model.User
import com.example.features.authentication.registration.data.mappers.mapDbModelToModel
import com.example.features.authentication.registration.domain.repository.AddUserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AddUserRepositoryImpl @Inject constructor(
    private val userDao: UserDao
) : AddUserRepository {

    override fun addUser(nickname: String, password: String, confirmWord: String): Flow<User?> = flow {
        val userDbModel = UserDbModel(
            nickname = nickname,
            password = password,
            confirmWord = confirmWord
        )
        userDao.addUser(userDbModel)
        val userModel = mapDbModelToModel(userDbModel)
        emit(userModel)
    }.catch {
        TODO()
    }
}