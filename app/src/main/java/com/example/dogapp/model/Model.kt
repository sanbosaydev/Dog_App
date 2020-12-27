package com.example.dogapp.model

import androidx.annotation.StringRes
import com.google.gson.annotations.SerializedName

data class DogBreed (

    @SerializedName ("id")
    val breedId: String?,
    @SerializedName ("name")
    val dogBreed: String?,
    @SerializedName ("lifespan")
    val lifeSpan: String?,
    @SerializedName ("breed_group")
    val breedGroup: String?,
    @SerializedName ("bred_for")
    val bredFor: String?,
    @SerializedName ("temperament")
    val temperament: String?,
    @SerializedName ("url")
    val imageUrl: String?
    )