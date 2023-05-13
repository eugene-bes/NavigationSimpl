package ai.doubletapp.sample.navigation.feature3

import ai.doubletapp.sample.navigation.feature1.api.navigation.Feature1Router
import ai.doubletapp.sample.navigation.feature3.api.navigation.Feature3Router
import ai.doubletapp.sample.navigation.feature3.databinding.FragmentFeature3Binding
import ai.doubletapp.sample.navigation.feature3.di.Feature3ComponentHolder
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import javax.inject.Inject

class Feature3Fragment : Fragment() {

    private lateinit var binding: FragmentFeature3Binding

    private val args by navArgs<Feature3FragmentArgs>()

    @Inject
    lateinit var feature1Router: Feature1Router

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFeature3Binding.inflate(inflater, container, false)
        setArgs()
        setClickListeners()
        return binding.root
    }

    override fun onAttach(context: Context) {
        Feature3ComponentHolder.get()
            .inject(this)
        super.onAttach(context)
    }

    override fun onDetach() {
        if (isRemoving) {
            Feature3ComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setArgs() {
        binding.args.text = getString(R.string.feature3_args, args.args.value)
    }

    private fun setClickListeners() {
        binding.run {
            buttonToFeature1.setOnClickListener {
                findNavController().popBackStack(destinationId = feature1Router.feature1().actionId, inclusive = true)
            }
            buttonBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }
}
