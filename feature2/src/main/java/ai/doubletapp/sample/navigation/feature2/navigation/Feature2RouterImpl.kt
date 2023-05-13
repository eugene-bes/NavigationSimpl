package ai.doubletapp.sample.navigation.feature2.navigation

import ai.doubletapp.sample.navigation.feature2.R
import ai.doubletapp.sample.navigation.feature2.api.navigation.Feature2Router
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.navigation.NavDirections
import javax.inject.Inject

class Feature2RouterImpl @Inject constructor(): Feature2Router {
    override fun toFeature2() = object : NavDirections {
        override val actionId: Int = R.id.feature2Flow
        override val arguments: Bundle = bundleOf()
    }
}
