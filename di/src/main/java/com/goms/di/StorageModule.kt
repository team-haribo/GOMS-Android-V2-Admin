package com.goms.di

import com.goms.data.local.storage.AuthStorage
import com.goms.data.local.storage.AuthStorageImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class StorageModule {

    @Binds
    abstract fun provideAuthStorage(
        authStorageImpl: AuthStorageImpl
    ): AuthStorage
}