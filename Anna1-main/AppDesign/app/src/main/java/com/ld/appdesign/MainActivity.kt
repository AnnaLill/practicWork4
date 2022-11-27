package com.ld.appdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.ld.appdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.listItem.onItemClickListener =
            AdapterView.OnItemClickListener { p0, p1, p2, p3 ->
                val itemList = binding.listItem.getItemAtPosition(p2) as String
                binding.textView.text = itemList
                when(p2){
                    0 -> binding.textView.setBackgroundResource(R.drawable.kazakhstan)
                    1 -> binding.textView.setBackgroundResource(R.drawable.kipr)
                    2 -> binding.textView.setBackgroundResource(R.drawable.anglia)
                    3 -> binding.textView.setBackgroundResource(R.drawable.armania)
                    4 -> binding.textView.setBackgroundResource(R.drawable.gruzia)
                    5 -> binding.textView.setBackgroundResource(R.drawable.egipet)
                    6 -> binding.textView.setBackgroundResource(R.drawable.australia)
                }
            }
    }

}