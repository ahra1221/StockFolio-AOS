package org.stockfolio.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.stockfolio.data.repository.SampleRepositoryImpl
import org.stockfolio.domain.repository.SampleRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindsSampleRepository(sampleRepositoryImpl: SampleRepositoryImpl): SampleRepository
}