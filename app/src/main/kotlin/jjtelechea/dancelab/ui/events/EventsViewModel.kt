package jjtelechea.dancelab.ui.events

import androidx.lifecycle.ViewModel
import jjtelechea.dancelab.domain.usecases.EventsUseCase

class EventsViewModel(private val eventsUseCase: EventsUseCase) : ViewModel() {

    fun getEvents() = eventsUseCase.execute()
}