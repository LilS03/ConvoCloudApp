package com.example.features.authentication.registration.di

import com.example.features.authentication.registration.data.repository.AddUserRepositoryImpl
import com.example.features.authentication.registration.domain.repository.AddUserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideAuthRepository(
        addUserRepositoryImpl: AddUserRepositoryImpl
    ): AddUserRepository = addUserRepositoryImpl
}