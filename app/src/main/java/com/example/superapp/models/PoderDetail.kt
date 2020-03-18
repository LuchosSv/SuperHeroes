package com.example.superapp.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PoderDetail(

    val poder: String,
    val poder2: String,
    val poder3: String,
    val poder4: String

):Parcelable