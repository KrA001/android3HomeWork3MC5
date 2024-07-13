package com.example.android3homework3mc5.com.ren.onlinestore.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.android3homework3mc5.R

fun ImageView.loadImage(url: String) {
    Glide.with(this.context)
        .load(url)
        .fallback(R.drawable.fallback_image)
        .into(this)
}