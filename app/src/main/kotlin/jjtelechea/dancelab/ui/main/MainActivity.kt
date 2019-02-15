package jjtelechea.dancelab.ui.main

import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import jjtelechea.dancelab.R
import jjtelechea.dancelab.core.base.BaseActivity
import jjtelechea.dancelab.databinding.ActivityEventsBinding
import jjtelechea.dancelab.ui.events.EventsViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    // Lazy Inject ViewModel
    private val eventsViewModel: EventsViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        val binding: ActivityEventsBinding = DataBindingUtil.setContentView(this, R.layout.activity_events)
        Log.d("MainActivity", eventsViewModel.getEventTitleViewModel())
    }
}
