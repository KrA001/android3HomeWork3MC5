package com.example.android3homework3mc5.com.ren.onlinestore.models

import androidx.lifecycle.LiveData

interface ProductRepository {

    fun getProducts(): LiveData<List<Product>>
}