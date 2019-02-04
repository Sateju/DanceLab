package jjtelechea.dancelab.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jjtelechea.dancelab.R
import jjtelechea.dancelab.ui.viewmodels.EventsViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class EventsActivity : AppCompatActivity() {

    // Lazy Inject ViewModel
    val eventsViewModel: EventsViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)
    }
}
