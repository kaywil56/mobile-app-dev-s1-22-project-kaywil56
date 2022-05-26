package op.mobile.app.dev.willkj8.travelling.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import op.mobile.app.dev.willkj8.travelling.R
import androidx.appcompat.widget.SwitchCompat
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.gms.maps.SupportMapFragment
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch
import op.mobile.app.dev.willkj8.travelling.helpers.settings.SettingsManager
import op.mobile.app.dev.willkj8.travelling.helpers.settings.UIMode
import op.mobile.app.dev.willkj8.travelling.ui.home.HomeFragmentDirections

class SettingsFragment : Fragment() {
    private lateinit var swToggleDarkMode: SwitchCompat
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        auth = FirebaseAuth.getInstance()

        val view: View = inflater.inflate(R.layout.fragment_settings, container, false)
        swToggleDarkMode = view.findViewById(R.id.sw_toggle_dark_mode)
        val logout: Button = view.findViewById(R.id.btn_logout)

        val settingsManager = SettingsManager(requireContext())
        settingsManager.uiModeFlow.asLiveData().observe(viewLifecycleOwner) {
            settingsManager.setCheckedUIMode(it, false, swToggleDarkMode, null)
        }

        swToggleDarkMode.setOnCheckedChangeListener { _, isChecked ->
            lifecycleScope.launch {
                when (isChecked) {
                    true -> settingsManager.setUIMode(UIMode.DARK)
                    false -> settingsManager.setUIMode(UIMode.LIGHT)
                }
            }
        }

        logout.setOnClickListener{
            auth.signOut()
            val action = SettingsFragmentDirections.actionSettingsFragmentToLoginFragment()
            findNavController().navigate(action)
        }

        return view
    }
}