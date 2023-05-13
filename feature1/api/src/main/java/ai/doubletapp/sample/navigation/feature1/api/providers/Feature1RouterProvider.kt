package ai.doubletapp.sample.navigation.feature1.api.providers

import ai.doubletapp.sample.navigation.feature1.api.navigation.Feature1Router

interface Feature1RouterProvider {
    fun provideFeature1Router(): Feature1Router
}
