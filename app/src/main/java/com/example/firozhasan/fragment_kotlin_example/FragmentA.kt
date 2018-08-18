package com.example.firozhasan.fragment_kotlin_example

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentA : Fragment() {

    /*Ques : What is layoutinflator or what is its main functionality
    * Ans : converting xml appearence definition into view objects in code is called inflation
    *
    * */
    var rootView : View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        rootView = inflater.inflate(R.layout.fragment_a, container, false)
        return rootView

    }
    companion object {
        fun newInstance() = FragmentA()
    }
}