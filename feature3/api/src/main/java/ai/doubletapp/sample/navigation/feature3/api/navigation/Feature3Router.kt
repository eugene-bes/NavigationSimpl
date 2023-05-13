package ai.doubletapp.sample.navigation.feature3.api.navigation

import androidx.navigation.NavDirections

interface Feature3Router {
    fun feature3(someArg1: Int, someArg2: String): NavDirections
}
