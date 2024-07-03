package com.learn.daggerexamplefakeapi.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.learn.daggerexamplefakeapi.models.Products

@Dao
interface FakerDAO {

    @Insert
    suspend fun addProducts(products: List<Products>)

    @Query("SELECT * FROM  Products")
    suspend fun getProducts(): List<Products>
}