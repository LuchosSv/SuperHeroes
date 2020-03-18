package com.example.superapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.superapp.fragments.HeroeList
import com.example.superapp.interfaces.ActivityListener
import com.example.superapp.interfaces.OnClickListener
import com.example.superapp.models.HeroesResponse

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.layoutContainer, HeroeList())
            addToBackStack("main")
            commit()
        }

    }
}
