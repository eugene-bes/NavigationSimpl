package ai.doubletapp.sample.navigation.feature2

import ai.doubletapp.sample.navigation.feature2.databinding.FragmentFeature2Binding
import ai.doubletapp.sample.navigation.feature2.di.Feature2ComponentHolder
import ai.doubletapp.sample.navigation.feature2.navigation.Feature2To3Args
import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import javax.inject.Inject

class Feature2Fragment : Fragment() {

    private lateinit var binding: FragmentFeature2Binding

    @Inject
    lateinit var feature3Router: Feature3Router

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFeature2Binding.inflate(inflater, container, false)
        setClickListeners()
        return binding.root
    }

    override fun onAttach(context: Context) {
        Feature2ComponentHolder.get()
            .inject(this)
        super.onAttach(context)
    }

    override fun onDetach() {
        if (isRemoving) {
            Feature2ComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setClickListeners() {
        binding.run {
            buttonToFeature3.setOnClickListener {
                findNavController().navigate(
                    feature3Router.feature3(someArg1 = 2, someArg2 = "Previous Feature Number")
                )
            }
            buttonBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

    private fun getFeature2To3Args(): Feature2To3Args = Feature2To3Args(
        someArg1 = 2,
        someArg2 = "Previous Feature Number",
    )
}
