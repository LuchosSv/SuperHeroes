package com.example.superapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

import com.example.superapp.R
import com.example.superapp.models.HeroesDetail

class HeroesDetailList : Fragment() {

    private var hero: HeroesDetail? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            hero = it.getParcelable("detail")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_heroes_detail_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Glide.with(this).load(hero!!.imageHeroe).into(view.findViewById(R.id.imageID))
        view.findViewById<TextView>(R.id.title).text = hero!!.name
        view.findViewById<TextView>(R.id.aparicionID).text = hero!!.fechaAparicion
        view.findViewById<TextView>(R.id.creadorID).text = hero!!.creador
        view.findViewById<TextView>(R.id.equipoID).text = hero!!.equipo
        view.findViewById<TextView>(R.id.descripcionID).text = hero!!.descripcion
        view.findViewById<TextView>(R.id.poderesID).text = hero!!.poderes[0].poder
        Glide.with(this).load(hero!!.compañeros[0].picture).into(view.findViewById(R.id.compañeroID))
    }

    companion object {

        @JvmStatic
        fun newInstance(hero: HeroesDetail) =
            HeroesDetailList().apply {
                arguments = Bundle().apply {
                    putParcelable("detail", hero)
                }
            }
    }
}
