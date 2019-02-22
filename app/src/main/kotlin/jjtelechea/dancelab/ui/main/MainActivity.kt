package jjtelechea.dancelab.ui.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import jjtelechea.dancelab.R
import jjtelechea.dancelab.core.base.BaseActivity
import jjtelechea.dancelab.databinding.ActivityMainBinding
import jjtelechea.dancelab.ui.events.EventsFragment
import jjtelechea.dancelab.ui.events.EventsViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setClickListenerToBottomNavigation()
    }

    private fun setClickListenerToBottomNavigation() {
        val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.main_bottom_navigation_events -> {
                    openFragment(EventsFragment.newInstance(), EventsFragment.FRAGMENT_TITLE)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.main_bottom_navigation_calendar -> {
                    return@OnNavigationItemSelectedListener true
                }
                R.id.main_bottom_navigation_capsules -> {
                    return@OnNavigationItemSelectedListener true
                }
                R.id.main_bottom_navigation_more -> {
                    return@OnNavigationItemSelectedListener true
                }
            }
            return@OnNavigationItemSelectedListener false
        }
        binding.mainBottomNavigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private fun openFragment(fragment: Fragment, title: String) {
        binding.mainToolbar.title = title
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
