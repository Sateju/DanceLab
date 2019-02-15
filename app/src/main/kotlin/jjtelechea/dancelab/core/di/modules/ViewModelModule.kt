package jjtelechea.dancelab.core.di.modules

import jjtelechea.dancelab.ui.events.EventsViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {

    // EventsViewModel ViewModel
    viewModel { EventsViewModel(eventsUseCase = get()) }
}