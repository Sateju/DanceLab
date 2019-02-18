package jjtelechea.dancelab.ui.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import jjtelechea.dancelab.R

class EventsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View =
        inflater.inflate(R.layout.fragment_events, container, false)

    companion object {
        const val FRAGMENT_TITLE = "Eventos"
        fun newInstance() = EventsFragment()
    }
}