package op.mobile.app.dev.willkj8.travelling.helpers.settings

import android.content.Context
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat
import androidx.datastore.DataStore
import androidx.datastore.preferences.*
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.MapStyleOptions
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import op.mobile.app.dev.willkj8.travelling.R
import java.io.IOException

/**
 * A class for managing the apps settings features
 *
 * This class manages ui features like dark mode.
 *
 * @param context Current context of the app
 */
class SettingsManager(val context: Context) {
    private val dataStore: DataStore<Preferences> =
        context.applicationContext.createDataStore(DATA_STORE_NAME)
    val uiModeFlow: Flow<UIMode> = dataStore.data.catch {
        if (it is IOException) {
            it.printStackTrace()
            emit((emptyPreferences()))
        } else {
            throw it
        }
    }.map {
        when (it[IS_DARK_MODE] ?: false) {
            true -> UIMode.DARK
            false -> UIMode.LIGHT
        }
    }
    /**
     * This function sets the current UI mode
     *
     * @param uiMode either dark or light
     */
    suspend fun setUIMode(uiMode: UIMode) {
        dataStore.edit {
            it[IS_DARK_MODE] = when (uiMode) {
                UIMode.LIGHT -> false
                UIMode.DARK -> true
            }
        }
    }
    /**
     * This function sets the google map style and set the ui mode to checked
     *
     * @param mode ui mode
     * @param isMainActivity if the function was called from the main activity
     * @param swUIMode A switch layout element
     * @param googleMap A google map instance
     * @param mapStyle A json style object
     * @param isUIModeChecked if the ui mode has been checked
     */
    private fun uiModeFeatures(
        mode: Int,
        isMainActivity: Boolean,
        swUIMode: SwitchCompat?,
        googleMap: GoogleMap?,
        mapStyle: Int,
        isUIModeChecked: Boolean
    ) {
        AppCompatDelegate.setDefaultNightMode(mode)
        if (!isMainActivity && swUIMode == null) {
            googleMap?.setMapStyle(
                MapStyleOptions.loadRawResourceStyle(
                    context,
                    mapStyle
                )
            )
        }
        swUIMode?.isChecked = isUIModeChecked
    }

    /**
     * This function sets the checked ui mode
     *
     * @param mode ui mode
     * @param isMainActivity if the function was called from the main activity
     * @param swUIMode A switch layout element
     * @param googleMap A google map instance
     */
    fun setCheckedUIMode(
        uiMode: UIMode?,
        isMainActivity: Boolean,
        swUIMode: SwitchCompat?,
        googleMap: GoogleMap?
    ) {
        when (uiMode) {
            UIMode.LIGHT -> {
                uiModeFeatures(
                    AppCompatDelegate.MODE_NIGHT_NO,
                    isMainActivity,
                    swUIMode,
                    googleMap,
                    R.raw.retro_google_map,
                    false
                )
            }
            UIMode.DARK -> {
                uiModeFeatures(
                    AppCompatDelegate.MODE_NIGHT_YES,
                    isMainActivity,
                    swUIMode,
                    googleMap,
                    R.raw.dark_google_map,
                    true
                )
            }
        }
    }

    companion object {
        private const val DATA_STORE_NAME = "settings.pref"
        private val IS_DARK_MODE = preferencesKey<Boolean>("is_dark_mode")
    }
}