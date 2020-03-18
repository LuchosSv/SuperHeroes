package com.example.superapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeroesDetail(

    val name: String,
    val imageHeroe: String,
    val fechaAparicion: String,
    val creador: String,
    val equipo: String,
    val descripcion: String,
    val poderes: List<PoderDetail>,
    val compañeros: List<CompañeroDetail>

):Parcelable