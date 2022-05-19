package op.mobile.app.dev.willkj8.travelling.ui.translator

import android.R
import android.content.Context
import android.widget.ArrayAdapter
import androidx.annotation.LayoutRes
import androidx.annotation.Nullable


class LangsAdapter(
    context: Context,
    @LayoutRes resource: Int,
    private val langsList:Array<String>
) :
    ArrayAdapter<String>(context, resource, langsList) {
    override fun getCount(): Int {
        return langsList.size
    }

    override fun getItem(position: Int): String {
        return langsList[position]
    }

}