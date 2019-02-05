package jjtelechea.dancelab.core.di.modules

import jjtelechea.dancelab.data.repository.EventsRepository
import jjtelechea.dancelab.data.repository.EventsRepositoryImpl
import org.koin.dsl.module.module

val repositoryModule = module {

    // single instance of EventsRepository
    single<EventsRepository> { EventsRepositoryImpl() }
}