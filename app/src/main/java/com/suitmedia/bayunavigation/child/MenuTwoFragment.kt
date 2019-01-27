package com.suitmedia.bayunavigation.child


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.suitmedia.bayunavigation.R
import kotlinx.android.synthetic.main.fragment_menu_two.*


/**
 * A simple [Fragment] subclass.
 *
 */
class MenuTwoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnDetail.setOnClickListener {
            findNavController().navigate(R.id.nav_menu_detail)
        }

        btnDetailBundle.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(MenuDetailFragment.ARG_EVENT,"HELLO WITH BUNDLE")
            findNavController().navigate(R.id.nav_menu_detail,bundle)

        }
    }


}
