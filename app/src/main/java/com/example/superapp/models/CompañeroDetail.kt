package com.example.superapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CompañeroDetail(

    val picture: String,
    val picture2: String,
    val picture3: String

):Parcelable