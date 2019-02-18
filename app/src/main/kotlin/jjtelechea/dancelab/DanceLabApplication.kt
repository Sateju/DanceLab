package jjtelechea.dancelab

import android.app.Application
import com.squareup.leakcanary.LeakCanary
import jjtelechea.dancelab.core.di.modules.repositoryModule
import jjtelechea.dancelab.core.di.modules.useCaseModule
import jjtelechea.dancelab.core.di.modules.viewModelModule
import org.koin.android.ext.android.startKoin

class DanceLabApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Koin
        startKoin(this, listOf(repositoryModule, useCaseModule, viewModelModule))

        // Leak Canary
        if (!LeakCanary.isInAnalyzerProcess(this)) LeakCanary.install(this)
    }
}