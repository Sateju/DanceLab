package jjtelechea.dancelab.ui.events.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import jjtelechea.dancelab.databinding.LayoutEventCardBinding
import jjtelechea.dancelab.ui.events.model.Event

class EventsAdapter(val events: Array<Event>) : RecyclerView.Adapter<EventsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LayoutEventCardBinding.inflate(inflater)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(events[position])
    }

    override fun getItemCount() = events.size

    inner class ViewHolder(val binding: LayoutEventCardBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Event) {
            binding.eventCardTitle.text = item.title
            binding.eventCardBody.text = item.url
            Glide.with(itemView.context).load(item.image).into(binding.eventCardImage)
            binding.executePendingBindings()
        }
    }
}



