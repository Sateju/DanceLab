package jjtelechea.dancelab

import android.app.Application
import jjtelechea.dancelab.core.di.modules.repositoryModule
import jjtelechea.dancelab.core.di.modules.useCaseModule
import jjtelechea.dancelab.core.di.modules.viewModelModule
import org.koin.android.ext.android.startKoin

class DanceLabApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(repositoryModule, useCaseModule, viewModelModule))
    }
}