package com.suitmedia.bayunavigation.child


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.suitmedia.bayunavigation.R
import kotlinx.android.synthetic.main.fragment_menu_detail.*

/**
 * A simple [Fragment] subclass.
 *
 */
class MenuDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getString(ARG_EVENT)?.let {
            if (!it?.isEmpty()) captionDetail.text = it
        }

    }

    companion object {
        val ARG_EVENT = "WORD"
    }
}
