package op.mobile.app.dev.willkj8.travelling.ui.home

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
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentHomeBinding
import op.mobile.app.dev.willkj8.travelling.ui.login.LoginFragmentDirections

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnToTools: Button = view.findViewById(R.id.btn_to_tools)

        btnToTools.setOnClickListener {
            val action = HomeFragmentDirections
                .actionHomeFragmentToToolsFragment()
            view?.findNavController()?.navigate(action)
        }

        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false
        )

        val viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            homeViewModel = viewModel
            return root
        }

        return view
    }
}