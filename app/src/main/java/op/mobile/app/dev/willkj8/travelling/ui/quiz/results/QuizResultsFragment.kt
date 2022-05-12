package op.mobile.app.dev.willkj8.travelling.ui.quiz.results

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.SwitchCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentQuizResultsBinding
import op.mobile.app.dev.willkj8.travelling.helpers.recyclerview.QuizResultRVAdapter
import op.mobile.app.dev.willkj8.travelling.model.QuizResult
import op.mobile.app.dev.willkj8.travelling.ui.tools.ToolsFragmentDirections

class QuizResultsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        val binding: FragmentQuizResultsBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_quiz_results,
            container,
            false
        )
        val view: View = inflater.inflate(R.layout.fragment_quiz_results, container, false)
        val bundle = QuizResultsFragmentArgs.fromBundle(requireArguments())
        val viewModelFactory = QuizResultsViewModelFactory(bundle.score, bundle.countryId, (activity?.applicationContext as QuizResultApplication).repository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(QuizResultsViewModel::class.java)
        viewModel.insertQuizResultDetail(QuizResult(viewModel.score, viewModel.countryId))
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            quizResultsViewModel = viewModel
            rvQuizDetails.adapter = QuizResultRVAdapter()

            return root
        }
    }
}