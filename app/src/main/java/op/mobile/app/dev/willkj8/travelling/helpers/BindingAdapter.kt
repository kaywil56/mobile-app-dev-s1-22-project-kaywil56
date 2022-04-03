package op.mobile.app.dev.willkj8.travelling

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import op.mobile.app.dev.willkj8.travelling.api.ServiceStatus

@BindingAdapter("service_status")
fun bindServiceStatus(tvStatus: TextView, status: ServiceStatus?) {
    when (status) {
        ServiceStatus.LOADING -> {
            tvStatus.visibility = View.VISIBLE
            tvStatus.text = "Loading..."
        }
        ServiceStatus.ERROR -> {
            tvStatus.visibility = View.VISIBLE
            tvStatus.text = "Connection Error"
        }
        ServiceStatus.COMPLETE -> tvStatus.visibility = View.GONE
    }
}