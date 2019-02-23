package jjtelechea.dancelab.ui.events

import androidx.lifecycle.ViewModel
import jjtelechea.dancelab.domain.usecases.EventsUseCase

class EventsViewModel(private val eventsUseCase: EventsUseCase) : ViewModel() {

    fun getEventTitleViewModel(): String {
        val eventEntity = eventsUseCase.execute()

        return "title: ${eventEntity.title} subtitle: ${eventEntity.imageUrl} from: ${this}"
    }
}