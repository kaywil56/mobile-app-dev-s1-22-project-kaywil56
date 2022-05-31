package op.mobile.app.dev.willkj8.travelling.ui.quiz.results


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import op.mobile.app.dev.willkj8.travelling.model.QuizResult
import op.mobile.app.dev.willkj8.travelling.repository.QuizResultRepository

/**
 * A view model class for the quiz results.
 *
 * This class handles data related to the quiz results ui.
 *
 * @param _score The final score for the quiz
 * @param _countryId The country ID of the quiz taken
 * @param _email The email of the current user
 * @param _userId The ID of the current user
 * @param _countryName The country name of the quiz taken
 * @param repository The repo for the quiz results
 */
class QuizResultsViewModel(_score: Int, _countryId: Int, _email: String, _userId: String, _countryName: String, private val repository: QuizResultRepository) : ViewModel() {
    var score : Int = _score
    var countryId: Int = _countryId
    var email: String = _email
    var userId: String = _userId
    var countryName = _countryName
    val allResultDetails: LiveData<List<QuizResult>> = repository.allResultDetails.asLiveData()

    /**
     * This function inserts the given data into the quiz results DB.
     *
     * @param quizResult The quiz result datat model
     */
    fun insertQuizResultDetail(quizResult: QuizResult) = CoroutineScope(Dispatchers.IO).launch {
        repository.insertQuizResultDetail(quizResult)
    }

    /**
     * This function deletes all data from the quiz results DB.
     */
    fun clearAll() = CoroutineScope(Dispatchers.IO).launch {
        repository.deleteAllQuizResultsDetail()
    }
}