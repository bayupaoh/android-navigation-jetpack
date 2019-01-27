package com.suitmedia.bayunavigation.child


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.suitmedia.bayunavigation.R


/**
 * A simple [Fragment] subclass.
 *
 */
class MenuOneFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_menu_one, container, false)
    }



    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        MenuInflater(activity).inflate(R.menu.menu_overflow, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        activity?.let { Navigation.findNavController(it, R.id.navOverMainActivity) }?.let {
            NavigationUI.onNavDestinationSelected(
                item!!,
                it
            )
        }
        return super.onOptionsItemSelected(item)
    }

}
