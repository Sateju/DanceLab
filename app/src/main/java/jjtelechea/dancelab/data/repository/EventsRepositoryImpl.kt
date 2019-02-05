package jjtelechea.dancelab.data.repository

import jjtelechea.dancelab.domain.repository.EventsRepository

class EventsRepositoryImpl : EventsRepository {

    override fun getEventTitle() = "Cápsula Bachata Disociación Corporal (Dámaris Cerro)"
    override fun getEventImage() = "https://dancelab.es/wp-content/uploads/disociacion-corporal-bachata_4.jpg";
}