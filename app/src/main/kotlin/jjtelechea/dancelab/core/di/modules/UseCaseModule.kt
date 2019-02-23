package jjtelechea.dancelab.core.di.modules


import jjtelechea.dancelab.domain.usecases.EventsUseCase
import jjtelechea.dancelab.domain.usecases.EventsUseCaseImpl
import org.koin.dsl.module.module

val useCaseModule = module {

    single { EventsUseCaseImpl(eventRepository = get()) as EventsUseCase }
}