package op.mobile.app.dev.willkj8.travelling.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R

class ToolsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tools, container, false)

        val btnToTranslator: Button = view.findViewById(R.id.btn_to_translator)
        val btnToQuiz: Button = view.findViewById(R.id.btn_to_quiz)
        val btnToSettings: Button = view.findViewById(R.id.btn_to_settings)

        btnToTranslator.setOnClickListener {
            val action = ToolsFragmentDirections
                .actionToolsFragmentToTranslatorFragment()
            view?.findNavController()?.navigate(action)
        }
        btnToQuiz.setOnClickListener {
            val action = ToolsFragmentDirections
                .actionToolsFragmentToQuizFragment()
            view?.findNavController()?.navigate(action)
        }
        btnToSettings.setOnClickListener {
            val action = ToolsFragmentDirections
                .actionToolsFragmentToSettingsFragment()
            view?.findNavController()?.navigate(action)
        }
        return view
    }
}