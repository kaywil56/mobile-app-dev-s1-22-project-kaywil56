package op.mobile.app.dev.willkj8.travelling.ui.quiz.results

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentQuizResultsBinding
import op.mobile.app.dev.willkj8.travelling.helpers.recyclerview.QuizResultRVAdapter
import op.mobile.app.dev.willkj8.travelling.model.QuizResult

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