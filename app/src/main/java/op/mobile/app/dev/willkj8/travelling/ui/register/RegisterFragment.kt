package op.mobile.app.dev.willkj8.travelling.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R

class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val btnRegister: Button = view.findViewById(R.id.btn_register)

        btnRegister.setOnClickListener {
            val action = RegisterFragmentDirections
                .actionRegisterFragmentToLoginFragment()
            view?.findNavController()?.navigate(action)
        }

        return view
    }
}