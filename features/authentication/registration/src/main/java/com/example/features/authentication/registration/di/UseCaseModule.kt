package com.example.features.authentication.registration.di

import com.example.features.authentication.registration.domain.usecase.AddUserUseCase
import com.example.features.authentication.registration.domain.usecase.AddUserUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
object UseCaseModule {
    @Provides
    fun provideAddUserUseCase(addUserUseCaseImpl: AddUserUseCaseImpl): AddUserUseCase = addUserUseCaseImpl
}