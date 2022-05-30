package op.mobile.app.dev.willkj8.travelling.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import op.mobile.app.dev.willkj8.travelling.R
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentSettingsBinding
import op.mobile.app.dev.willkj8.travelling.helpers.settings.SettingsManager
import op.mobile.app.dev.willkj8.travelling.helpers.settings.UIMode

class SettingsFragment : Fragment() {
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentSettingsBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_settings,
            container,
            false
        )

        val navMenu: BottomNavigationView = requireActivity().findViewById(R.id.nav_view)

        navMenu.visibility = View.VISIBLE

        auth = FirebaseAuth.getInstance()

        val settingsManager = SettingsManager(requireContext())
        settingsManager.uiModeFlow.asLiveData().observe(viewLifecycleOwner) {
            settingsManager.setCheckedUIMode(it, false, binding.swToggleDarkMode, null)
        }

        binding.swToggleDarkMode.setOnCheckedChangeListener { _, isChecked ->
            lifecycleScope.launch {
                when (isChecked) {
                    true -> settingsManager.setUIMode(UIMode.DARK)
                    false -> settingsManager.setUIMode(UIMode.LIGHT)
                }
            }
        }

        binding.btnLogout.setOnClickListener{
            navMenu.visibility = View.GONE
            auth.signOut()
            val action = SettingsFragmentDirections.actionSettingsFragmentToSplashFragment()
            findNavController().navigate(action)
        }

        return binding.root
    }
}