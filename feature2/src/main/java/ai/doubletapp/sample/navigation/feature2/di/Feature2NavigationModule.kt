package ai.doubletapp.sample.navigation.feature2.di

import ai.doubletapp.sample.navigation.feature2.api.navigation.Feature2Router
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2RouterImpl
import dagger.Binds
import dagger.Module

@Module
interface Feature2NavigationModule {
    @Binds
    fun provideFeature2RouterImpl(impl: Feature2RouterImpl): Feature2Router
}
