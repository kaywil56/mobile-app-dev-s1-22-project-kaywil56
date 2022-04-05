package op.mobile.app.dev.willkj8.travelling.ui.register

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import op.mobile.app.dev.willkj8.travelling.R

class RegisterFragment: Fragment() {
    private lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        // Get a new instance of Firebase authentication
        auth = FirebaseAuth.getInstance()

        val btnRegister: Button = view.findViewById(R.id.btn_register)
        val etEmailAddress: EditText = view.findViewById(R.id.et_email_address)
        val etPassword: EditText = view.findViewById(R.id.et_password)
        val etConfirmPassword: EditText = view.findViewById(R.id.et_confirm_password)

        btnRegister.setOnClickListener {
            val email = etEmailAddress.text.toString()
            val valid = isValidEmail(email)
            val password = etPassword.text.toString()
            val confirmPassword = etConfirmPassword.text.toString()

            when {
                email.isEmpty() ->
                    etEmailAddress.error = "Email is required."
                !valid ->
                    etEmailAddress.error = "Invalid format."
                password.isEmpty() ->
                    etPassword.error = "Password is required."
                password.length < 8 ->
                    etPassword.error = "Password must be at least 8 characters."
                password != confirmPassword ->
                    etConfirmPassword.error = "Password and does not match."
                else -> {
                    register(email, password)
                }
            }
        }
        return view
    }

    // Checks for valid email, returns true or false
    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    /**
     * This function register a new user using Firebase authentication
     *
     * @param email the new user's email address
     * @param password the new user's password
     */
    private fun register(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if (it.isSuccessful) {
                    // Indicate to the application user that a new user has been created
                    Toast.makeText(
                        activity,
                        "User created.",
                        Toast.LENGTH_LONG
                    ).show()

                    // Navigate to the login screen. Check mobile_navigation.xml for this action
                    view?.findNavController()?.navigate(
                        RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
                    )
                } else {
                    // Indicate to the application user if the email address already exists
                    Toast.makeText(
                        activity,
                        "Email address already exists.",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }
}