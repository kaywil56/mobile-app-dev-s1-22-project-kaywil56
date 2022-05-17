package op.mobile.app.dev.willkj8.travelling.ui.quiz.results

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.willkj8.travelling.repository.QuizResultRepository

@Suppress("UNCHECKED_CAST")
class QuizResultsViewModelFactory(private val score: Int, private val countryId: Int, private val email: String, private val userId: String,  private val repository: QuizResultRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizResultsViewModel::class.java))
            return QuizResultsViewModel(score, countryId, email, userId, repository) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}