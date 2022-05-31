package op.mobile.app.dev.willkj8.travelling.ui.quiz.results

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.firebase.auth.FirebaseAuth
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.databinding.FragmentQuizResultsBinding
import op.mobile.app.dev.willkj8.travelling.helpers.recyclerview.QuizResultRVAdapter
import op.mobile.app.dev.willkj8.travelling.model.QuizResult

/**
 * A fragment class for the *Quiz Results* feature
 *
 * This class handles the logic for the quiz results
 */
class QuizResultsFragment : Fragment() {
    private lateinit var auth: FirebaseAuth

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

        auth = FirebaseAuth.getInstance()
        val email = auth.currentUser?.email.toString()
        val userId = auth.currentUser?.uid.toString()

        val bundle = QuizResultsFragmentArgs.fromBundle(requireArguments())
        val viewModelFactory = QuizResultsViewModelFactory(bundle.score, bundle.countryId, email, userId, bundle.countryName, (activity?.applicationContext as QuizResultApplication).repository)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(QuizResultsViewModel::class.java)


        viewModel.insertQuizResultDetail(QuizResult(viewModel.score, viewModel.countryId, viewModel.email, viewModel.userId, viewModel.countryName))
        binding.apply {
            lifecycleOwner = viewLifecycleOwner
            quizResultsViewModel = viewModel
            rvQuizDetails.adapter = QuizResultRVAdapter()

            btnDeleteResults.setOnClickListener {
                val builder = AlertDialog.Builder(requireContext())
                builder.setTitle("Delete All Results")
                builder.setMessage("Are you sure?")

                builder.setPositiveButton(android.R.string.ok) { _, _ ->
                    viewModel.clearAll()
                }

                builder.setNegativeButton(android.R.string.cancel) { _, _ ->
                    Toast.makeText(context,
                        "Deletion canceled", Toast.LENGTH_SHORT).show()
                }
                builder.show()
            }

            return root
        }
    }
}