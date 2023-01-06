package com.example.estimmo.backend

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ImmoBackendModule{
    @Binds
    abstract fun bindImmoBackend(immoBackendImpl:ImmoBackendImpl):ImmoBackendInterface
}
