package ai.doubletapp.sample.navigation.feature1.navigation

import ai.doubletapp.sample.navigation.feature1.R
import ai.doubletapp.sample.navigation.feature1.api.navigation.Feature1Router
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.navigation.NavDirections
import javax.inject.Inject

class Feature1RouterImpl @Inject constructor(): Feature1Router {
    override fun feature1() = object : NavDirections {
        override val actionId: Int = R.id.feature1Flow
        override val arguments: Bundle = bundleOf()
    }
}
