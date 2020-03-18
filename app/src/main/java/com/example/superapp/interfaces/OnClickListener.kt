package com.example.superapp.interfaces

import com.example.superapp.models.HeroesResponse

interface OnClickListener {

    fun clickCard(heroes: HeroesResponse)
}