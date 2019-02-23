package jjtelechea.dancelab.ui.capsules

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import jjtelechea.dancelab.R
import jjtelechea.dancelab.databinding.FragmentCapsulesBinding

class CapsulesFragment : Fragment() {

    companion object {
        const val FRAGMENT_TITLE = "Cápsulas"
        fun newInstance() = CapsulesFragment()
    }

    private lateinit var binding: FragmentCapsulesBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_capsules, container, false)
        return binding.root
    }
}