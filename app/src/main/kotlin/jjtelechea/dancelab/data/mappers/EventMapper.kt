package jjtelechea.dancelab.data.mappers

import jjtelechea.dancelab.data.entities.EventRepositoryEntity
import jjtelechea.dancelab.domain.entities.EventEntity

class EventMapper {

    companion object {

        fun getEventFromRepositoryEvent(eventRepositoryEntity: EventRepositoryEntity): EventEntity {
            return EventEntity(
                eventRepositoryEntity.title,
                eventRepositoryEntity.imageUrl,
                eventRepositoryEntity.url
            )
        }
    }
}