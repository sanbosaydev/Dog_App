package com.example.dogapp.util

import android.content.Context
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.load.Options
import com.bumptech.glide.request.RequestOptions
import com.example.dogapp.R

fun getProgressDrawable (context: Context): CircularProgressDrawable {
    return CircularProgressDrawable(context).apply {
        strokeWidth = 10f
        centerRadius = 50f
        start()
    }
}

fun ImageView.loadImage (uri: String?,progressDrawable :CircularProgressDrawable) {
   val options =  RequestOptions()
       .placeholder(progressDrawable)
       .error(R.mipmap.ic_dog_icon)

    Glide.with(context)
        .setDefaultRequestOptions(options)
        .load(uri)
        .into(this)
}