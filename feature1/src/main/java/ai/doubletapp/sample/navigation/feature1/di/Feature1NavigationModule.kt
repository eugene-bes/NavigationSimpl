package ai.doubletapp.sample.navigation.feature1.di

import ai.doubletapp.sample.navigation.feature1.api.navigation.Feature1Router
import ai.doubletapp.sample.navigation.feature1.navigation.Feature1RouterImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature1NavigationModule {
    @Binds
    fun provideFeature1RouterImpl(impl: Feature1RouterImpl): Feature1Router
}
