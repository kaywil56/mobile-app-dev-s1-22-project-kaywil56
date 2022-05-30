package op.mobile.app.dev.willkj8.travelling.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import op.mobile.app.dev.willkj8.travelling.model.QuizResult

@Database(entities = [QuizResult::class], version = 1, exportSchema = true)
abstract class QuizResultDb : RoomDatabase() {
    abstract fun quizResultDao(): IQuizResultDao

    companion object {
        @Volatile
        private var INSTANCE: QuizResultDb? = null

        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): QuizResultDb {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    QuizResultDb::class.java,
                    "quiz_result"
                )
                    .addCallback(QuizResultDbCallback(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }

    private class QuizResultDbCallback(
        private val scope: CoroutineScope
    ) : RoomDatabase.Callback() {
        override fun onCreate(db: SupportSQLiteDatabase) {
            super.onCreate(db)
            INSTANCE?.let { database ->
                scope.launch(Dispatchers.IO) {
                    populateDb(database.quizResultDao())
                }
            }
        }

        fun populateDb(quizResultDao: IQuizResultDao) {
            quizResultDao.deleteAll()
            val result = QuizResult(0, 1, "jdoe@mail.com", "abcdefg", "China")
            quizResultDao.insert(result)
        }
    }
}