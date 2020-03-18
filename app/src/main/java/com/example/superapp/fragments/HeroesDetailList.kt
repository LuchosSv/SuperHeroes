package com.example.superapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
        view.findViewById<Button>(R.id.poderesID).text = hero!!.poderes[0].poder
        view.findViewById<Button>(R.id.poderes2ID).text = hero!!.poderes[0].poder2
        view.findViewById<Button>(R.id.poderes3ID).text = hero!!.poderes[0].poder3
        view.findViewById<Button>(R.id.poderes4ID).text = hero!!.poderes[0].poder4
        Glide.with(this).load(hero!!.compañeros[0].picture)
            .into(view.findViewById(R.id.compañeroID))
        Glide.with(this).load(hero!!.compañeros[0].picture2)
            .into(view.findViewById(R.id.compañero2ID))
        Glide.with(this).load(hero!!.compañeros[0].picture3)
            .into(view.findViewById(R.id.compañero3ID))
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
