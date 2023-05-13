package ai.doubletapp.sample.navigation.feature3.navigation

import ai.doubletapp.sample.navigation.feature3.Feature3FragmentArgs
import ai.doubletapp.sample.navigation.feature3.R
import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router
import android.os.Bundle
import androidx.navigation.NavDirections
import javax.inject.Inject

class Feature3RouterImpl @Inject constructor() : Feature3Router {
    override fun feature3(someArg1: Int, someArg2: String): NavDirections = object : NavDirections {
        override val actionId: Int = R.id.feature3Flow
        override val arguments: Bundle = Feature3FragmentArgs(
            args = Feature3Args(value = "$someArg2 : $someArg1")
        ).toBundle()
    }
}
