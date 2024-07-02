package com.learn.daggerexamplefakeapi.retrofit

import com.learn.daggerexamplefakeapi.models.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
    suspend fun getProducts(): Response<List<Products>>
}