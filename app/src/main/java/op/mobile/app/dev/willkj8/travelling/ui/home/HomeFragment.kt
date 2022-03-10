package op.mobile.app.dev.willkj8.travelling.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.ui.login.LoginFragmentDirections

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnToTranslator: Button = view.findViewById(R.id.btn_to_translator)

        btnToTranslator.setOnClickListener {
            val action = HomeFragmentDirections
                .actionHomeFragmentToTranslatorFragment()
            view?.findNavController()?.navigate(action)
        }
        return view
    }
}