package jjtelechea.dancelab.data.mappers

import jjtelechea.dancelab.data.entities.EventModel
import jjtelechea.dancelab.domain.entities.EventEntity

class EventModelMapper {

    companion object {

        fun transform(eventModel: EventModel): EventEntity {
            return EventEntity(
                eventModel.title,
                eventModel.imageUrl,
                eventModel.url
            )
        }
    }
}