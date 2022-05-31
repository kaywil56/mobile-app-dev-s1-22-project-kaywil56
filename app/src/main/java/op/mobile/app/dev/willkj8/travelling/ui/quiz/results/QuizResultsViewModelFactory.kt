package op.mobile.app.dev.willkj8.travelling.ui.quiz.results

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.willkj8.travelling.repository.QuizResultRepository

@Suppress("UNCHECKED_CAST")

/**
 * A view model factory class for the quiz results.
 *
 * This class instantiates the quiz results view model.
 *
 * @param score The final score for the quiz
 * @param countryId The country ID of the quiz taken
 * @param email The email of the current user
 * @param userId The ID of the current user
 * @param countryName The country name of the quiz taken
 * @param repository The repo for the quiz results
 */
class QuizResultsViewModelFactory(private val score: Int, private val countryId: Int, private val email: String, private val userId: String, private val countryName: String,  private val repository: QuizResultRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizResultsViewModel::class.java))
            return QuizResultsViewModel(score, countryId, email, userId, countryName, repository) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}