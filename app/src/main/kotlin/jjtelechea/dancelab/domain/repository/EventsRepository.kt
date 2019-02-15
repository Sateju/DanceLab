package jjtelechea.dancelab.domain.repository

interface EventsRepository {
    fun getEventTitle(): String
    fun getEventImage(): String
}