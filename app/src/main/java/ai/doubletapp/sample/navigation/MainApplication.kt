package ai.doubletapp.sample.navigation

import ai.doubletapp.sample.navigation.di.AppComponent
import ai.doubletapp.sample.navigation.di.ComponentHolderInitializer
import ai.doubletapp.sample.navigation.di.DaggerAppComponent
import android.app.Application
import javax.inject.Inject

internal class MainApplication : Application() {

    @Inject
    lateinit var componentHolderInitializer: ComponentHolderInitializer

    private val appComponent: AppComponent get() = DaggerAppComponent.factory().create()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)
        componentHolderInitializer.init()
    }
}
