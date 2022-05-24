package com.example.assessmentandroid.models

import com.google.gson.annotations.SerializedName
import com.example.assessmentandroid.models.LocationModel

data class CharactersModel (
    @SerializedName("id") val id: Number,
    @SerializedName("name") val name: String,
    @SerializedName("gender") val gender: String,
    @SerializedName("image") val image: String,
    @SerializedName("status") val status: String,
    @SerializedName("location") val location: ArrayList<LocationModel>
    )