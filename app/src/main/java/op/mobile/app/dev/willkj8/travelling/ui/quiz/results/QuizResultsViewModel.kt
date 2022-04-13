package op.mobile.app.dev.willkj8.travelling.ui.quiz.results


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import op.mobile.app.dev.willkj8.travelling.model.QuizResult
import op.mobile.app.dev.willkj8.travelling.repository.QuizResultRespository

class QuizResultsViewModel(_score: Int, private val repository: QuizResultRespository) : ViewModel() {
    var score : Int = _score
    val allResultDetails: LiveData<List<QuizResult>> = repository.allResultDetails.asLiveData()
    fun insertQuizResultDetail(quizResult: QuizResult) = CoroutineScope(Dispatchers.IO).launch {
        repository.insertQuizResultDetail(quizResult)
    }
}