package op.mobile.app.dev.willkj8.travelling.ui.quiz.results

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import op.mobile.app.dev.willkj8.travelling.database.QuizResultDb
import op.mobile.app.dev.willkj8.travelling.repository.QuizResultRepository

/**
 * A Application class for quiz results.
 *
 * This class allow the quiz result DB to be a member of the Application class.
 */
class QuizResultApplication : Application() {
    private val applicationScope = CoroutineScope(SupervisorJob())
    private val database by lazy { QuizResultDb.getDatabase(this, applicationScope) }
    val repository by lazy { QuizResultRepository(database.quizResultDao()) }
}