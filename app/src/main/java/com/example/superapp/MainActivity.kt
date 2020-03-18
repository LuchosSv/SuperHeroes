package com.example.superapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.superapp.fragments.HeroeList
import com.example.superapp.interfaces.ActivityListener
import com.example.superapp.interfaces.OnClickListener
import com.example.superapp.models.HeroesResponse

class MainActivity : AppCompatActivity(), ActivityListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.layoutContainer, HeroeList())
            addToBackStack("main")
            commit()
        }

    }

    override fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.layoutContainer, fragment)
            addToBackStack(null)
            commit()
        }
    }
}
