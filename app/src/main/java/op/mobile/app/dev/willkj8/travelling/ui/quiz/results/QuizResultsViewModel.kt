package op.mobile.app.dev.willkj8.travelling.ui.quiz.results


import android.R.attr.data
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import op.mobile.app.dev.willkj8.travelling.model.QuizResult
import op.mobile.app.dev.willkj8.travelling.repository.QuizResultRespository


class QuizResultsViewModel(_score: Int, _countryId: Int, private val repository: QuizResultRespository) : ViewModel() {
    var score : Int = _score
    var countryId: Int = _countryId
    val allResultDetails: LiveData<List<QuizResult>> = repository.allResultDetails.asLiveData()

    fun insertQuizResultDetail(quizResult: QuizResult) = CoroutineScope(Dispatchers.IO).launch {
        repository.insertQuizResultDetail(quizResult)
    }

    fun clearAll() = CoroutineScope(Dispatchers.IO).launch {
        repository.deleteAllQuizResultsDetail()
    }
}