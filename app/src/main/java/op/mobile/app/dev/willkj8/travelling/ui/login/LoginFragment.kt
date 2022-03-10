package op.mobile.app.dev.willkj8.travelling.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        val btnLogin: Button = view.findViewById(R.id.btn_login)
        val btnToRegister: Button = view.findViewById(R.id.btn_to_register)

        btnLogin.setOnClickListener {
            val action = LoginFragmentDirections
                .actionLoginFragmentToHomeFragment()
            view?.findNavController()?.navigate(action)
        }
        btnToRegister.setOnClickListener {
            val action = LoginFragmentDirections
                .actionLoginFragmentToRegisterFragment()
            view?.findNavController()?.navigate(action)
        }

        return view
    }
}