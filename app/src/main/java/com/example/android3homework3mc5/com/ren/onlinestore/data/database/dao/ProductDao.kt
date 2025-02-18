package com.example.android3homework3mc5.com.ren.onlinestore.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.android3homework3mc5.com.ren.onlinestore.data.database.entities.ProductDBO

@Dao
interface ProductDao {

    @Query("SELECT * FROM product")
    fun getAllProducts(): LiveData<List<ProductDBO>>
}