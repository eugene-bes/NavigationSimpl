package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.feature1.di.Feature1ComponentHolder
import ai.doubletapp.sample.navigation.feature1.di.Feature1Dependencies
import ai.doubletapp.sample.navigation.feature2.di.Feature2ComponentHolder
import ai.doubletapp.sample.navigation.feature2.di.Feature2Dependencies
import ai.doubletapp.sample.navigation.feature3.di.Feature3ComponentHolder
import ai.doubletapp.sample.navigation.feature3.di.Feature3Dependencies
import javax.inject.Inject
import javax.inject.Provider

internal class ComponentHolderInitializer @Inject constructor(
    private val feature1Dependencies: Provider<Feature1Dependencies>,
    private val feature2Dependencies: Provider<Feature2Dependencies>,
    private val feature3Dependencies: Provider<Feature3Dependencies>,
) {

    fun init() {
        Feature1ComponentHolder.init(feature1Dependencies)
        Feature2ComponentHolder.init(feature2Dependencies)
        Feature3ComponentHolder.init(feature3Dependencies)
    }
}
