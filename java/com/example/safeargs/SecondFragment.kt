package com.example.safeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {
    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        var count = args.count + 1
        val txtCount = view.findViewById<TextView>(R.id.secondTxt)
        txtCount.text = count.toString()

        txtCount.setOnClickListener {
            val action = SecondFragmentDirections.actionSecondFragmentToThirdFragment(count)
            findNavController().navigate(action)
        }
        return view
    }
}