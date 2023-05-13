package ai.doubletapp.sample.navigation.feature1.di

import ai.doubletapp.sample.navigation.di.BaseDependencies
import ai.doubletapp.sample.navigation.feature2.api.navigation.Feature2Router

interface Feature1Dependencies : BaseDependencies {

    val router2: Feature2Router
}
