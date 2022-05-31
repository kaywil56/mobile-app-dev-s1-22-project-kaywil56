package op.mobile.app.dev.willkj8.travelling.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentSplashBinding

/**
 * A Fragment class for the *Splash*.
 *
 * This class handles logic for the splash screen.
 */
class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentSplashBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_splash,
            container,
            false
        )

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val action = SplashFragmentDirections
                    .actionSplashFragmentToLoginFragment()
                view?.findNavController()?.navigate(action)
                // Navigate from the splash screen to the login screen, i.e., create an action in mobile_navigation.xml
            },
            3000
        )

        return binding.root
    }
}