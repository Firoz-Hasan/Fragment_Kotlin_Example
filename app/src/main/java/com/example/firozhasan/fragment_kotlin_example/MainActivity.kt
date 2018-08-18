package com.example.firozhasan.fragment_kotlin_example

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), FragmentC.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {

    }

    var fragmentA_BTN: Button? = null
    var fragmentB_BTN: Button? = null
    var fragmentC_BTN: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
        onclick()
    }

    private fun onclick() {
        fragmentA_BTN?.setOnClickListener {
             //val fragment = FragmentA()
            replaceFragment(FragmentA.newInstance())


        }
        fragmentB_BTN?.setOnClickListener {
            val fragment = FragmentB()
            replaceFragment(fragment)
        }
        fragmentC_BTN?.setOnClickListener {
            val fragment = FragmentC()
            replaceFragment(fragment)
        }
    }

    private fun initialize() {
        fragmentA_BTN = findViewById(R.id.frag_A)
        fragmentB_BTN = findViewById(R.id.frag_B)
        fragmentC_BTN = findViewById(R.id.frag_C)
    }


    private fun replaceFragment(fragment: Fragment) {
        // create a FragmentManager(old java way now we hv support manager dont need frag manager)
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        // replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.group, fragment)
        // save the changes
        fragmentTransaction.commit()


    }
}
