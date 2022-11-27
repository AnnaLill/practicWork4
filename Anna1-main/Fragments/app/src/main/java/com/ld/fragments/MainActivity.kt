package com.ld.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ld.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        actionFragments(R.id.place_holder, Fragment1())
        binding.button2.setOnClickListener {
            actionFragments(R.id.place_holder, Fragment2())
        }
        binding.button.setOnClickListener {
            actionFragments(R.id.place_holder, Fragment1())
        }
    }

    fun actionFragments(placeholder: Int, fragments: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(placeholder, fragments)
            .commit()
    }
}