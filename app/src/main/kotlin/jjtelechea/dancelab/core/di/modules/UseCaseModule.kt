package jjtelechea.dancelab.core.di.modules


import jjtelechea.dancelab.domain.usecases.EventsUseCase
import org.koin.dsl.module.module

val useCaseModule = module {

    factory { EventsUseCase(eventsRepository = get()) }
}