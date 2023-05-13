package ai.doubletapp.sample.navigation.feature3.api.providers

import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router

interface Feature3RouterProvider {
    fun provideFeature3Router(): Feature3Router
}
