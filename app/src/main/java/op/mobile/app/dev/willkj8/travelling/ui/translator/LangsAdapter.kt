package op.mobile.app.dev.willkj8.travelling.ui.translator

import android.content.Context
import android.widget.ArrayAdapter
import androidx.annotation.LayoutRes

/**
 * A class for the available languages list adapter.
 *
 * This class handles logic for the languages list adapter.
 *
 * @param context The apps current context.
 * @param resource the spinner layout.
 * @param langsList the given list of languages.
 */
class LangsAdapter(
    context: Context,
    @LayoutRes resource: Int,
    private val langsList:Array<String>
) :
    ArrayAdapter<String>(context, resource, langsList) {

    /**
     * Gets the sizes of the given list.
     */
    override fun getCount(): Int {
        return langsList.size
    }

    /**
     * Gets the position of a selected item
     *
     * @param position The position of the selected list item
     *
     * @return The languages position
     */
    override fun getItem(position: Int): String {
        return langsList[position]
    }

}