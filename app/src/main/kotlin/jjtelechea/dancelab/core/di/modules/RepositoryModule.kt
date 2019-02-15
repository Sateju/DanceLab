package jjtelechea.dancelab.core.di.modules

import jjtelechea.dancelab.data.repository.EventsRepositoryImpl
import jjtelechea.dancelab.domain.repository.EventsRepository
import org.koin.dsl.module.module

val repositoryModule = module {

    // single instance of EventsRepository
    single { EventsRepositoryImpl() as EventsRepository }
}