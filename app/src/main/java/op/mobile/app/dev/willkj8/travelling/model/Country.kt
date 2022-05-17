package op.mobile.app.dev.willkj8.travelling.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 * Unlike strings, integers and booleans, user defined objects can not be passed
 * between Fragments.
 *
 * Resource: https://developer.android.com/kotlin/parcelize
 */
@Parcelize
data class Country(
    val id: Int,
    val name: String,
    val flagImg: String,
    val langCode: String,
    val phrases: List<String>,
    val quiz: @RawValue List<Quiz>, // Serialize List of Quiz
    val attractions: @RawValue List<Attraction> // Serialize List of Attraction
) : Parcelable