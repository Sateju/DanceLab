package jjtelechea.dancelab.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import jjtelechea.dancelab.R
import jjtelechea.dancelab.databinding.FragmentEventsBinding

class EventsFragment : Fragment() {

    companion object {
        const val FRAGMENT_TITLE = "Eventos"
        fun newInstance() = EventsFragment()
    }

    private lateinit var binding: FragmentEventsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_events, container, false)
        return binding.root
    }
}