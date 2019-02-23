package jjtelechea.dancelab.domain.repository

import jjtelechea.dancelab.domain.entities.EventEntity

interface EventRepository {
    fun getEvent(): EventEntity
}