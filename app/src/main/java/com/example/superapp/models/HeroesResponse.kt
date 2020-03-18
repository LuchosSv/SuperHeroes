package com.example.superapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HeroesResponse(

    val data: List<HeroesDetail>,
    val message: String,
    val isSucces: Boolean

):Parcelable