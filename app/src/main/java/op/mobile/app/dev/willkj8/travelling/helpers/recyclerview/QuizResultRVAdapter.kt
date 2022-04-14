package op.mobile.app.dev.willkj8.travelling.helpers.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import op.mobile.app.dev.willkj8.travelling.databinding.RecyclerViewResultItemBinding

import op.mobile.app.dev.willkj8.travelling.model.QuizResult


class QuizResultRVAdapter:
    ListAdapter<QuizResult, QuizResultRVAdapter.QuizResultRVViewHolder>(DiffCallback) {
    companion object DiffCallback : DiffUtil.ItemCallback<QuizResult>() {
        override fun areItemsTheSame(
            oldItem: QuizResult,
            newItem: QuizResult
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: QuizResult,
            newItem: QuizResult
        ): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): QuizResultRVViewHolder {
        return QuizResultRVViewHolder(
            RecyclerViewResultItemBinding.inflate(
                LayoutInflater.from(
                    parent.context
                )
            )
        )
    }
    override fun onBindViewHolder(
        holder: QuizResultRVViewHolder,
        position: Int
    ) {
        val quizResult = getItem(position)
        holder.bind(quizResult)
    }

    inner class QuizResultRVViewHolder(private var binding: RecyclerViewResultItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(quizResult: QuizResult) {
            binding.quizResult = quizResult
            binding.executePendingBindings()
        }
    }
}