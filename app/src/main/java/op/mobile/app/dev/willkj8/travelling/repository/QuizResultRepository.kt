package op.mobile.app.dev.willkj8.travelling.repository

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow
import op.mobile.app.dev.willkj8.travelling.database.IQuizResultDao
import op.mobile.app.dev.willkj8.travelling.model.QuizResult


class QuizResultRepository(private val QuizResultDao: IQuizResultDao) {
        val allResultDetails: Flow<List<QuizResult>> = QuizResultDao.getAll()

        @WorkerThread
        fun insertQuizResultDetail(quiz_result: QuizResult) {
            QuizResultDao.insert(quiz_result)
        }

        @WorkerThread
        fun deleteAllQuizResultsDetail() {
            QuizResultDao.deleteAll()
        }
}