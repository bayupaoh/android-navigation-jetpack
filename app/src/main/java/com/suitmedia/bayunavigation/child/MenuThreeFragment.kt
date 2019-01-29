package com.suitmedia.bayunavigation.child


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import com.suitmedia.bayunavigation.R
import kotlinx.android.synthetic.main.fragment_menu_three.*


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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        menuThreeSend?.setOnClickListener {
            if(menuThreeMessage?.text?.toString()?.isEmpty()!!){
                Toast.makeText(activity,"Message tidak boleh kosong",Toast.LENGTH_LONG).show()
            }else{
                val action = MenuThreeFragmentDirections.actionToMenuDetailSafe()
                action.setMessage(menuThreeMessage?.text?.toString()!!)
                findNavController().navigate(action)
            }
        }
    }

}
