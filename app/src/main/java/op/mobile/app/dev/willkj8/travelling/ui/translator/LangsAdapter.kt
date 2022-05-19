//package op.mobile.app.dev.willkj8.travelling.ui.translator
//
//import android.R
//import android.content.Context
//import android.widget.ArrayAdapter
//import androidx.annotation.LayoutRes
//import androidx.annotation.Nullable
//
//
//class LangsAdapter(
//    context: Context,
//    @LayoutRes resource: Int,
//    private val items: ArrayList<Map.Entry<String, String>>
//) :
//    ArrayAdapter<String>(context, resource, R.id.spinner_text) {
//    override fun getCount(): Int {
//        return items.size
//    }
//
//    @Nullable
//    override fun getItem(position: Int): String {
//        return items[position].value
//    }
//
//    fun getKeyByPosition(position: Int): String {
//        return items[position].key
//    }
//}