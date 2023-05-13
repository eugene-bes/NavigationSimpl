package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.feature1.api.providers.Feature1RouterProvider
import ai.doubletapp.sample.navigation.feature1.di.Feature1NavigationModule
import ai.doubletapp.sample.navigation.feature2.api.providers.Feature2RouterProvider
import ai.doubletapp.sample.navigation.feature2.di.Feature2NavigationModule
import ai.doubletapp.sample.navigation.feature3.api.providers.Feature3RouterProvider
import ai.doubletapp.sample.navigation.feature3.di.Feature3NavigationModule
import dagger.Module

@Module(
    includes = [
        Feature1NavigationModule::class,
        Feature2NavigationModule::class,
        Feature3NavigationModule::class
    ]
)
interface AppNavigationModule

interface AppNavigationProviders :
    Feature1RouterProvider,
    Feature2RouterProvider,
    Feature3RouterProvider
