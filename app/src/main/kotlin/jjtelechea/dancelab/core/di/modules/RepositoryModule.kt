package jjtelechea.dancelab.core.di.modules

import jjtelechea.dancelab.data.repository.EventRepositoryImpl
import jjtelechea.dancelab.domain.repository.EventRepository
import org.koin.dsl.module.module

val repositoryModule = module {

    // single instance of EventRepository
    single { EventRepositoryImpl() as EventRepository }
}