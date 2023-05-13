package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.feature1.api.navigation.Feature1Router
import ai.doubletapp.sample.navigation.feature1.di.Feature1Dependencies
import ai.doubletapp.sample.navigation.feature2.api.navigation.Feature2Router
import ai.doubletapp.sample.navigation.feature2.di.Feature2Dependencies
import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router
import ai.doubletapp.sample.navigation.feature3.di.Feature3Dependencies
import dagger.Module
import dagger.Provides

@Module
internal class AppModule {


    @Provides
    fun provideFeature1Dependencies(router: Feature2Router): Feature1Dependencies = object : Feature1Dependencies {
        override val router2: Feature2Router = router

    }

    @Provides
    fun provideFeature2Dependencies(router: Feature3Router): Feature2Dependencies = object : Feature2Dependencies {
        override fun depen3(): Feature3Router = router

    }

    @Provides
    fun provideFeature3Dependencies(router: Feature1Router): Feature3Dependencies = object : Feature3Dependencies {
        override fun depen1(): Feature1Router = router

    }
}
