package jjtelechea.dancelab.data.repository

interface EventsRepository {
    fun getEventTitle(): String
}

class EventsRepositoryImpl() : EventsRepository {
    override fun getEventTitle() = "Cápsula Bachata Disociación Corporal (Dámaris Cerro)"
}