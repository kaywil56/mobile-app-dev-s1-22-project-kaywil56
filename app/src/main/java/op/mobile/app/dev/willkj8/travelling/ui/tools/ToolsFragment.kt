package op.mobile.app.dev.willkj8.travelling.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentToolsBinding

class ToolsFragment : Fragment() {
    private lateinit var viewModel: ToolsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding: FragmentToolsBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_tools,
            container,
            false
        )
        val viewModelFactory =
            ToolsViewModelFactory(
                ToolsFragmentArgs.fromBundle(requireArguments()).country
            )

        viewModel = ViewModelProvider(
            this,
            viewModelFactory
        ).get(ToolsViewModel::class.java)

        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            toolsViewModel = viewModel

            btnToSettings.setOnClickListener {
                val action = ToolsFragmentDirections
                    .actionToolsFragmentToSettingsFragment()
                view?.findNavController()
                    ?.navigate(action)
            }

            btnToTranslator.setOnClickListener {
                val action = ToolsFragmentDirections
                    .actionToolsFragmentToTranslatorFragment()
                view?.findNavController()
                    ?.navigate(action)
            }

            btnToQuiz.setOnClickListener {
                val action = ToolsFragmentDirections
                    .actionToolsFragmentToQuizFragment(viewModel.country)
                view?.findNavController()
                    ?.navigate(action)
            }
            return root
        }
    }
}