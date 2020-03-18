package com.example.superapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.superapp.R
import com.example.superapp.interfaces.OnClickListener
import com.example.superapp.models.HeroesDetail
import com.example.superapp.models.HeroesResponse

class HeroesAdapter (private val hero: List<HeroesResponse>, private val listener: OnClickListener):
    RecyclerView.Adapter<HeroesAdapter.ViewHolder>(){

    inner class ViewHolder(itemView: View, private val listemer: OnClickListener): RecyclerView.ViewHolder(itemView){
        fun bindData(hero: HeroesResponse){
            val text = itemView.findViewById<TextView>(R.id.textView)
            val image = itemView.findViewById<ImageView>(R.id.imageView)
            text.text = hero.data[0].name
            //Glide.with(itemView).load(hero.data[0].imageHeroe).into(image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_items, parent, false)
        return ViewHolder(view, listener)
    }

    override fun getItemCount(): Int {
        return hero.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(hero[position])
    }


}