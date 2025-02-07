package com.example.features.authentication.registration.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.features.authentication.registration.domain.usecase.AddUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val addUserUseCase: AddUserUseCase
) : ViewModel() {
    fun addUser(nickname: String, password: String, confirmWord: String) {
        viewModelScope.launch {
            addUserUseCase.invoke(nickname, password, confirmWord)
        }
    }
}