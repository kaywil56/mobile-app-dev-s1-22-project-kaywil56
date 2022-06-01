package op.mobile.app.dev.willkj8.travelling.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import op.mobile.app.dev.willkj8.travelling.model.QuizResult
import kotlinx.coroutines.flow.Flow

/**
 * A interface used for the quiz result DB
 *
 * controls the DB functionality
 */
@Dao
interface IQuizResultDao {
    /**
     * This function gets all data from the quiz result DB
     */
    @Query("SELECT * FROM quiz_result")
    fun getAll(): Flow<List<QuizResult>>

    /**
     * This function inserts given data into the quiz result DB
     */
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(quiz_result: QuizResult)

    /**
     * This function all data from the quiz result DB
     */
    @Query("DELETE FROM quiz_result")
    fun deleteAll()
}