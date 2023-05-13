package ai.doubletapp.sample.navigation.di

import ai.doubletapp.sample.navigation.MainApplication
import dagger.Component

@Component(modules = [AppModule::class, AppNavigationModule::class])
internal interface AppComponent : AppNavigationProviders {

    fun inject(app: MainApplication)

    @Component.Factory
    interface Factory {
        fun create(): AppComponent
    }
}
