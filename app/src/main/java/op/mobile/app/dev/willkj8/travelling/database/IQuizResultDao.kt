package op.mobile.app.dev.willkj8.travelling.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import op.mobile.app.dev.willkj8.travelling.model.QuizResult
import kotlinx.coroutines.flow.Flow

@Dao
interface IQuizResultDao {
    @Query("SELECT * FROM quiz_result")
    fun getAll(): Flow<List<QuizResult>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(quiz_result: QuizResult)

    @Query("DELETE FROM quiz_result")
    fun deleteAll()
}