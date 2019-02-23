package jjtelechea.dancelab.domain.usecases

import jjtelechea.dancelab.domain.entities.EventEntity
import jjtelechea.dancelab.domain.repository.EventRepository

interface EventsUseCase {
    fun execute(): EventEntity
}

class EventsUseCaseImpl(private val eventRepository: EventRepository) : EventsUseCase {

    override fun execute(): EventEntity {
        return eventRepository.getEvent()
    }
}