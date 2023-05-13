package ai.doubletapp.sample.navigation.feature2.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router

interface Feature2Dependencies : BaseDependencies {
    fun depen3(): Feature3Router
}
