package jjtelechea.dancelab.data.repository

import jjtelechea.dancelab.data.entities.EventModel
import jjtelechea.dancelab.data.mappers.EventMapper
import jjtelechea.dancelab.domain.entities.EventEntity
import jjtelechea.dancelab.domain.repository.EventRepository

class EventRepositoryImpl : EventRepository {
    override fun getEvent(): EventEntity {
        val eventRepositoryEntity = EventModel(
            "Cápsula Bachata Disociación Corporal (Dámaris Cerro)",
            "https://dancelab.es/wp-content/uploads/disociacion-corporal-bachata_4.jpg",
            "https://dancelab.es/capsula-bachata-disociacion-corporal-damaris-cerro/"
        )
        return EventMapper.transform(eventRepositoryEntity)
    }
}