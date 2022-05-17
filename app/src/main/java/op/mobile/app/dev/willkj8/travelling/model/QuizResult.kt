package op.mobile.app.dev.willkj8.travelling.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "quiz_result")
data class QuizResult(
    @ColumnInfo(name = "score")
    var score: Int,

    @ColumnInfo(name = "country_id")
    var countryId: Int,

    @ColumnInfo(name = "email")
    var email: String,

    @ColumnInfo(name = "user_id")
    var userId: String,
){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int? = null
}

