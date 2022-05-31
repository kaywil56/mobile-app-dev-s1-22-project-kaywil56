package op.mobile.app.dev.willkj8.travelling.model

/**
 * A data model class for the quiz.
 *
 * This class is a model for the quiz questions and answers
 */
data class Quiz(
    val question: String,
    val answers: List<String>,
)