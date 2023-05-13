package ai.doubletapp.sample.navigation.feature1

import ai.doubletapp.sample.navigation.feature1.databinding.FragmentFeature1Binding
import ai.doubletapp.sample.navigation.feature1.di.Feature1ComponentHolder
import ai.doubletapp.sample.navigation.feature2.api.navigation.Feature2Router
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import javax.inject.Inject

class Feature1Fragment : Fragment() {

    private lateinit var binding: FragmentFeature1Binding

    @Inject
    lateinit var feature2Router: Feature2Router

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentFeature1Binding.inflate(inflater, container, false)
        setClickListeners()
        return binding.root
    }

    override fun onAttach(context: Context) {
        Feature1ComponentHolder.get()
            .inject(this)
        super.onAttach(context)
    }

    override fun onDetach() {
        if (isRemoving) {
            Feature1ComponentHolder.clear()
        }
        super.onDetach()
    }

    private fun setClickListeners() {
        binding.button.setOnClickListener {
            findNavController().navigate(feature2Router.toFeature2())
        }
    }
}
