package jjtelechea.dancelab.ui.events.mapper

import jjtelechea.dancelab.domain.entities.EventEntity
import jjtelechea.dancelab.ui.events.model.Event

class EventMapper {

    companion object {

        fun transform(eventEntity: EventEntity): Event = Event(eventEntity.imageUrl, eventEntity.title, eventEntity.url)
    }
}