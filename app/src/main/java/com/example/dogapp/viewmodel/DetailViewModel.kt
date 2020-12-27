package com.example.dogapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dogapp.model.DogBreed

class DetailViewModel: ViewModel(){
    val dogLiveData = MutableLiveData<DogBreed>()
    fun fetch() {
        val dog =  DogBreed("1", "Corgi", "15", "breedGroup", "bredFor", "temperament", "")
        dogLiveData.value= dog
    }
}