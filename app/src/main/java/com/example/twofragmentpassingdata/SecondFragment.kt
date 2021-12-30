package com.example.twofragmentpassingdata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondFragment : Fragment() {

    private var displayMessage:String? =""
    private lateinit var txt :TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view=  inflater.inflate(R.layout.fragment_second, container, false)

        txt = view.findViewById(R.id.displayMessage)
        displayMessage= arguments?.getString("input")

         txt.text=displayMessage


            return view
    }

}