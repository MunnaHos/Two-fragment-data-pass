package com.example.twofragmentpassingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),Communication {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA=FirstFragment()

        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragmentA).commit()



    }

    override fun passData(editText: String) {
        val bundle = Bundle()
        bundle.putString("input",editText)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragmentB = SecondFragment()
        fragmentB.arguments=bundle

        transaction.replace(R.id.fragment_container,fragmentB)
        transaction.commit()

    }
}