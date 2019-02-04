package jjtelechea.dancelab.core.di.modules

import jjtelechea.dancelab.data.repository.EventsRepository
import jjtelechea.dancelab.data.repository.EventsRepositoryImpl
import jjtelechea.dancelab.ui.viewmodels.EventsViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {

    // single instance of EventsRepository
    single<EventsRepository> { EventsRepositoryImpl() }

    // EventsViewModel ViewModel
    viewModel { EventsViewModel(get()) }
}