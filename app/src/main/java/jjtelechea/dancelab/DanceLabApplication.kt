package jjtelechea.dancelab

import android.app.Application
import jjtelechea.dancelab.core.di.modules.appModule
import org.koin.android.ext.android.startKoin

class DanceLabApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))
    }
}