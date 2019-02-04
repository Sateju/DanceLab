package jjtelechea.dancelab.ui.viewmodels

import androidx.lifecycle.ViewModel
import jjtelechea.dancelab.data.repository.EventsRepository

class EventsViewModel(private val repository: EventsRepository) : ViewModel() {

    fun getEventTitleViewModel() = "${repository.getEventTitle()} from $this"
}