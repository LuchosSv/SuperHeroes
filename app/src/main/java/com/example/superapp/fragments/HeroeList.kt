package com.example.superapp.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
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
import java.lang.Exception

/**
 * A simple [Fragment] subclass.
 */
class HeroeList : Fragment(), OnClickListener {

    private var listener: ActivityListener? = null
    lateinit var recyclerView: RecyclerView
    private var heroesArray = arrayListOf<HeroesDetail>()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            listener = context as ActivityListener
        } catch (e: Exception) {
            Log.i("MSG", "EEHH")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

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
        heroesArray = HeroesList()
        recyclerView.adapter = HeroesAdapter(heroesArray, this)

    }

    private fun HeroesList(): ArrayList<HeroesDetail> {
        return arrayListOf(
            HeroesDetail(
                "HULK",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/7dae7438650505.598fa119bd7b4.jpg",
                "The Incredible Hulk #1, mayo de 1962",
                "Stan Lee y Jack Kirby",
                "Marvel",
                "Hulk, es un personaje ficticio, que aparece en los cómics estadounidenses publicados por la editorial Marvel Comics.",
                arrayListOf(
                    PoderDetail(
                        "Super fuerza",
                        "Super Velocidad",
                        "Aumento de Tamaño",
                        "Cambia Color"
                    )
                ),
                arrayListOf(
                    CompañeroDetail(
                        "https://www.behance.net/gallery/38650505/Flat-Design-Hero-Avatars",
                        "com/example/superapp/fragments/HeroeList.kt:76", ""
                    )

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
                    PoderDetail("fuerza", "Super Velocidad", "Agilidad", "Imnune a Gases")
                ),
                arrayListOf(
                    CompañeroDetail(
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/592db138650505.598fa11a28ec5.jpg",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/3671da38650505.598fa119575fb.jpg",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/a21d2d38650505.598fa28915bf8.jpg"
                    )

                )
            ),
            HeroesDetail(
                "Iron Man",
                "https://mir-s3-cdn-cf.behance.net/project_modules/disp/e13eb438650505.598fa118c8eab.jpg",
                "Tales of Suspense #39, marzo de 1963",
                "Stan Lee",
                "Marvel",
                "Anthony Edward Stark, más conocido como Tony Stark, un multimillonario magnate empresarial estadounidense, playboy e ingenioso científico.",
                arrayListOf(
                    PoderDetail("Volar", "Lanza Rayos", "Fuerza", "Velocidad")
                ),
                arrayListOf(
                    CompañeroDetail(
                        "https://www.behance.net/gallery/38650505/Flat-Design-Hero-Avatars",
                        "com/example/superapp/fragments/HeroeList.kt:76",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/e0614f38650505.598fa2898a971.png"
                    )

                )
            ),
            HeroesDetail(
                "Spider Man",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/64838738650505.598fa28916115.png",
                "Amazing Fantasy #15, 10 de agosto de 1962",
                "Stan Lee y Steve Ditko",
                "Marvel",
                "Spider Man es un superhéroe ficticio creado por los escritores y editores Stan Lee y Steve Ditko.",
                arrayListOf(
                    PoderDetail("Agilidad", "Poder Trepar", "Fuerza", "Sectido Aracnido")
                ),
                arrayListOf(
                    CompañeroDetail(
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/9b4afa38650505.598fa11a29566.png",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/9b4afa38650505.598fa11a29566.png",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/89c30c38650505.598fa2898ae5a.png"
                    )

                )
            ),
            HeroesDetail(
                "Thor",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/88c1e338650505.598fa119bc679.jpg",
                "Journey Into Mystery #83, agosto de 1962",
                "Stan Lee, Larry Lieber y Jack Kirby, basándose en el dios Thor de la mitología nórdica",
                "Marvel",
                "Thor es un superhéroe ficticio que aparece en los cómics estadounidenses publicados por Marvel Comics.",
                arrayListOf(
                    PoderDetail(
                        "Super Fuerza",
                        "Resistencia",
                        "Inmune a las Enfermedades",
                        "Bendecido por los Dioses"
                    )
                ),
                arrayListOf(
                    CompañeroDetail(
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/3595e038650505.598fa119bd2bc.jpg",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/a21d2d38650505.598fa28915bf8.jpg",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/dcd2b838650505.59bfa81fd2c9d.png"
                    )

                )
            ),
            HeroesDetail(
                "Ant Man",
                "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/14809638650505.598fa118c91f3.jpg",
                "Tales to Astonish # 27, Enero de 1962",
                "Stan Lee, Larry Lieber y Jack Kirby",
                "Marvel",
                "El personaje era originalmente el sobrenombre del superhéroe científico brillante Hank Pym, después de" +
                        " haber inventado una sustancia que puede hacer que la persona cambie de tamaño.",
                arrayListOf(
                    PoderDetail(
                        "Reducir su Tamaño",
                        "Comunicarse con Hormigas",
                        "Agilidad",
                        "Fuerza"
                    )
                ),
                arrayListOf(
                    CompañeroDetail(
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/3595e038650505.598fa119bd2bc.jpg",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/dcd2b838650505.59bfa81fd2c9d.png",
                        "https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/aa688238650505.598fa2898b5da.png"
                    )

                )
            )
        )
    }

    override fun clickCard(heroes: HeroesDetail) {
        val fragment = HeroesDetailList.newInstance(heroes)
        listener?.loadFragment(fragment)
    }

}
