package ai.doubletapp.sample.navigation.feature3.di

import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router
import ai.doubletapp.sample.navigation.feature3.navigation.Feature3RouterImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature3NavigationModule {
    @Binds
    fun provideFeature3RouterImpl(impl: Feature3RouterImpl): Feature3Router
}
