package ai.doubletapp.sample.navigation.feature3.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.feature1.api.navigation.Feature1Router

interface Feature3Dependencies : BaseDependencies {
    fun depen1(): Feature1Router
}
