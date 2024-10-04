package com.example.safeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {
    private val count = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        val txtCount = view.findViewById<TextView>(R.id.firstTxt)
        txtCount.text = count.toString()

        txtCount.setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(count)
            findNavController().navigate(action)
        }
        return view
    }
}