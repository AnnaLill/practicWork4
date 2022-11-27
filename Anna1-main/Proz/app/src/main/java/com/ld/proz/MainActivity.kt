package com.ld.proz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Proza","Черемуха душистая")
        Log.d("Proza","С весною расцвела")
        Log.d("Proza","И ветки золотистые,")
        Log.d("Proza","Что кудри, завила.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Proza","Кругом роса медвяная")
        Log.d("Proza","Сползает по коре,")
        Log.d("Proza","Под нею зелень пряная")
        Log.d("Proza","Сияет в серебре.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Proza","А рядом, у проталинки,")
        Log.d("Proza","В траве, между корней,")
        Log.d("Proza","Бежит, струится маленький")
        Log.d("Proza","Серебряный ручей.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Proza","Черемуха душистая,")
        Log.d("Proza","Развесившись, стоит,")
        Log.d("Proza","А зелень золотистая")
        Log.d("Proza","На солнышке горит.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Proza","Ручей волной гремучею")
        Log.d("Proza","Все ветки обдает")
        Log.d("Proza","И вкрадчиво под кручею")
        Log.d("Proza","Ей песенки поет.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Proza","Автор: С.А.Есенин")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Proza","Черемуха")
    }
}