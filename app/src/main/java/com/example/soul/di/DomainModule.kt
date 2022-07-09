package com.example.soul.di

import com.example.soul.domain.interactor.RegistrationInteractor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindRegistrationInteractor(
        interactor: RegistrationInteractor.Base
    ): RegistrationInteractor
}
