package com.learn.daggerexamplefakeapi.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.learn.daggerexamplefakeapi.db.FakerDB
import com.learn.daggerexamplefakeapi.models.Products
import com.learn.daggerexamplefakeapi.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val fakerApi: FakerApi,
    private val fakerDB: FakerDB
) {

    private val _products = MutableLiveData<List<Products>>()
    val products: LiveData<List<Products>>
    get() = _products

    suspend fun getProducts(){
        val result = fakerApi.getProducts()
        if (result.isSuccessful && result.body() != null){
            fakerDB.getFakerDAO().addProducts(result.body()!!)
            _products.postValue(result.body())
        }
    }
}