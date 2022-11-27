package com.ld.animals

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.ld.animals.databinding.ActivityMainBinding
import com.ld.traning.animals.AnimalsList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)//Добавление в программу байдинга
        setContentView(binding.root)
        val listAnimals = listOf(
            AnimalsList.herbivores1,
            AnimalsList.herbivores2,
            AnimalsList.predatoryAnimal1,
            AnimalsList.predatoryAnimal2
        )
        //Создание списка с животными
        val adapter = ArrayAdapter(this, R.layout.simple_list_item_1,listAnimals)
        //Создание адаптера для вывода списка в ListView и на экран
        binding.listView.adapter = adapter //Присваиваем списку адаптер
    }
}