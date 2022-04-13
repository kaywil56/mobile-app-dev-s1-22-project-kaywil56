package op.mobile.app.dev.willkj8.travelling.helpers

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.api.ServiceStatus
import op.mobile.app.dev.willkj8.travelling.helpers.recyclerview.CountryRVAdapter
import op.mobile.app.dev.willkj8.travelling.helpers.recyclerview.QuizResultRVAdapter
import op.mobile.app.dev.willkj8.travelling.model.Country
import op.mobile.app.dev.willkj8.travelling.model.QuizResult

@BindingAdapter("country_list_data")
fun setCountryListData(rv: RecyclerView, data: List<Country>?) {
    val adapter = rv.adapter as CountryRVAdapter
    adapter.submitList(data)
}

@BindingAdapter("quiz_result_list_data")
fun setQuizResultListData(rv: RecyclerView, data: List<QuizResult>?) {
    val adapter = rv.adapter as QuizResultRVAdapter
    adapter.submitList(data)
}

@BindingAdapter("service_status")
fun setServiceStatus(tv: TextView, status: ServiceStatus?) {
    when (status) {
        ServiceStatus.LOADING -> {
            tv.visibility = View.VISIBLE
            tv.text = tv.context.getString(R.string.loading)
        }
        ServiceStatus.ERROR -> {
            tv.visibility = View.VISIBLE
            tv.text = tv.context.getString(R.string.connection_error)
        }
        ServiceStatus.COMPLETE -> tv.visibility = View.GONE
    }
}

@BindingAdapter("round_image")
fun setRoundImage(iv: ImageView, imageUrl: String) {
    Glide.with(iv.context)
        .load(imageUrl)
        .apply(RequestOptions().circleCrop())
        .into(iv)
}

@BindingAdapter("square_image")
fun setSquareImage(iv: ImageView, imageUrl: String) {
    Glide.with(iv.context)
        .load(imageUrl)
        .apply(
            RequestOptions.bitmapTransform(RoundedCorners(8))
        )
        .into(iv)
}