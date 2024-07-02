package com.learn.daggerexamplefakeapi.di

import com.learn.daggerexamplefakeapi.retrofit.FakerApi
import com.learn.daggerexamplefakeapi.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesFakerAPI(retrofit: Retrofit): FakerApi{
        return retrofit.create(FakerApi::class.java)
    }
}