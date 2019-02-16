package jjtelechea.dancelab.domain.usecases

import jjtelechea.dancelab.domain.entities.EventEntity
import jjtelechea.dancelab.domain.repository.EventsRepository

interface EventsUseCase {
    fun execute(): EventEntity
}

class EventsUseCaseImpl(private val eventsRepository: EventsRepository) : EventsUseCase {

    override fun execute(): EventEntity {
        return EventEntity(eventsRepository.getEventTitle(), eventsRepository.getEventTitle())
    }
}