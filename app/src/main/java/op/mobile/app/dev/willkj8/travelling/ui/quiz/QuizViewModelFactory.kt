package op.mobile.app.dev.willkj8.travelling.ui.quiz

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import op.mobile.app.dev.willkj8.travelling.model.Country

/**
 * A view model factory class for the quiz.
 *
 * This class instantiates the quiz view model.
 *
 * @param country The selected country object.
 */
@Suppress("UNCHECKED_CAST")
class QuizViewModelFactory(
    private val country: Country
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizViewModel::class.java))
            return QuizViewModel(country) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}