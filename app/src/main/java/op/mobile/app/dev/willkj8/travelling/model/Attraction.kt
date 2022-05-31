package op.mobile.app.dev.willkj8.travelling.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

/**
 * A data model class for the attractions.
 *
 * This class holds values taken from the country object.
 */
@Parcelize
data class Attraction(
    val name: String,
    val cityTown: String,
    val location: @RawValue Location
) : Parcelable

data class Location(
    val latitude: Double,
    val longitude: Double
)
