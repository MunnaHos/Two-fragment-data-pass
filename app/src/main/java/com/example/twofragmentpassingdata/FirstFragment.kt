package com.example.twofragmentpassingdata

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.FragmentManager


class FirstFragment : Fragment() {

private lateinit var txt:EditText
private lateinit var btn :Button
private lateinit var communication: Communication
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_first, container, false)

        txt= view.findViewById(R.id.messageInput)
        btn= view.findViewById(R.id.sand_btn)
        communication= activity as Communication


      btn.setOnClickListener {
               val input=txt.text.toString()
           communication.passData(input)
        }
        return view
    }



}