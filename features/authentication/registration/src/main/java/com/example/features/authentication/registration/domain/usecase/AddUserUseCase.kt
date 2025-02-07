package com.example.features.authentication.registration.domain.usecase

import com.example.core.data.model.User
import com.example.features.authentication.registration.domain.repository.AddUserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

fun interface AddUserUseCase{
    operator fun invoke(nickname: String, password: String, confirmWord: String): Flow<User?>
}class AddUserUseCaseImpl @Inject constructor(
    private val repository: AddUserRepository
) : AddUserUseCase {
    override fun invoke(nickname: String, password: String, confirmWord: String): Flow<User?> =
        repository.addUser(nickname, password, confirmWord)
            .flowOn(Dispatchers.IO)
}