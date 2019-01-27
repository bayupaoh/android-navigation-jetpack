package com.suitmedia.bayunavigation.child


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suitmedia.bayunavigation.R


/**
 * A simple [Fragment] subclass.
 *
 */
class MenuThreeFragment : Fragment() {

    var viewFragment: View ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewFragment = inflater.inflate(R.layout.fragment_menu_three, container, false)
        return viewFragment
    }


}
