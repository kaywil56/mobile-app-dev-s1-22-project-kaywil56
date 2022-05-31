package op.mobile.app.dev.willkj8.travelling.ui.map

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.databinding.DataBindingUtil
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.databinding.MarkerInfoWindowBinding
import op.mobile.app.dev.willkj8.travelling.model.Attraction

/**
 * Class implements GoogleMap.InfoWindowAdapter. This class needs a reference
 * to a Context, i.e., MapFragment
 */
class AttractionInfoWindow(context: Context) : GoogleMap.InfoWindowAdapter {

    /**
     * Inflating the marker_info_window.xml
     */
    private val binding: MarkerInfoWindowBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        R.layout.marker_info_window,
        null,
        false
    )

    /**
     * Implementing member of GoogleMap.InfoWindowAdapter. Provides a
     * custom info window for a marker
     */
    override fun getInfoWindow(marker: Marker): View {
        val attraction: Attraction = marker.tag as Attraction
        binding.tvName.text = attraction.name
        binding.tvCityTown.text = attraction.cityTown
        return binding.root
    }

    /**
     * Implementing member of GoogleMap.InfoWindowAdapter.
     */
    override fun getInfoContents(marker: Marker): View? = null
}