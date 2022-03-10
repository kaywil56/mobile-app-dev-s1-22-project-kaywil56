package op.mobile.app.dev.willkj8.travelling.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_splash, container, false)

        Handler(Looper.getMainLooper()).postDelayed(
            {
                val action = SplashFragmentDirections
                    .actionSplashFragmentToLoginFragment()
                view.findNavController().navigate(action)
            },
            3000
        )

        return view
    }
}