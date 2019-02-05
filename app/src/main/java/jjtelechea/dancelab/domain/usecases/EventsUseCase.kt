package jjtelechea.dancelab.domain.usecases

import jjtelechea.dancelab.domain.entities.EventEntity
import jjtelechea.dancelab.domain.repository.EventsRepository


class EventsUseCase(private val eventsRepository: EventsRepository) {

    fun execute(): EventEntity {
        return EventEntity(eventsRepository.getEventTitle(), eventsRepository.getEventTitle())
    }
}