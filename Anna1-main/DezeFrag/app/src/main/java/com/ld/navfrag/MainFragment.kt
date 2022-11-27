package com.ld.navfrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn1 = view.findViewById<Button>(R.id.button)
        val btn2 = view.findViewById<Button>(R.id.button2)
        val controller = findNavController()
        btn1.setOnClickListener {controller.navigate(R.id.blankFragment)}
        btn2.setOnClickListener {controller.navigate(R.id.blankFragment2)}
    }
}