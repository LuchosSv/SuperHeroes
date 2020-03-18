package com.example.superapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.superapp.R
import com.example.superapp.adapters.HeroesAdapter
import com.example.superapp.interfaces.ActivityListener
import com.example.superapp.interfaces.OnClickListener
import com.example.superapp.models.CompañeroDetail
import com.example.superapp.models.HeroesDetail
import com.example.superapp.models.HeroesResponse
import com.example.superapp.models.PoderDetail

/**
 * A simple [Fragment] subclass.
 */
class HeroeList : Fragment(), OnClickListener {

    private var listener: ActivityListener? = null
    lateinit var recyclerView: RecyclerView
    private var heroesArray = arrayListOf<HeroesResponse>()
    //private var heroesArray = arrayListOf<heroeResponseList>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_heroe_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.adapter = HeroesAdapter(heroesArray,this)

        var heroeResponseList =
            HeroesResponse(
            arrayListOf(
                HeroesDetail(
                    "HULK",
                    "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/7dae7438650505.598fa119bd7b4.jpg",
                    "The Incredible Hulk #1, mayo de 1962",
                    "Stan Lee y Jack Kirby",
                    "Marvel",
                    "Hulk, es un personaje ficticio, que aparece en los cómics estadounidenses publicados por la editorial Marvel Comics.",
                    arrayListOf(
                        PoderDetail("Super fuerza")
                    ),
                    arrayListOf(
                        CompañeroDetail("Iron Man")

                    )
                ),
                HeroesDetail(
                    "Capitan America",
                    "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/16ebe638650505.598fa2891596b.png",
                    "Captain America Comics #1, Marzo de 1941",
                    "Joe Simon y Jack Kirby",
                    "Marvel",
                    "Capitán América cuyo nombre real es Steven Steve Rogers, es un superhéroe ficticio que aparece en los cómics estadounidenses ",
                    arrayListOf(
                        PoderDetail("Super fuerza")
                    ),
                    arrayListOf(
                        CompañeroDetail("Iron Man")

                    )
                ),
                HeroesDetail(
                    "HULK",
                    "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/7dae7438650505.598fa119bd7b4.jpg",
                    "The Incredible Hulk #1, mayo de 1962",
                    "Stan Lee y Jack Kirby",
                    "Marvel",
                    "Hulk, es un personaje ficticio, que aparece en los cómics estadounidenses publicados por la editorial Marvel Comics.",
                    arrayListOf(
                        PoderDetail("Super fuerza")
                    ),
                    arrayListOf(
                        CompañeroDetail("Iron Man")

                    )
                )
            ),
            "Buenos superheroes",
            true
        )

    }

    override fun clickCard(heroes: HeroesResponse) {
        TODO("Not yet implemented")
    }

}
