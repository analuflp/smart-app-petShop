package com.phoebus.smart_app_pet_shop.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {

    private lateinit var INSTANCE: Retrofit

    private fun getRetrofit(): Retrofit {

        val httpClient = OkHttpClient.Builder()

       if(!:: INSTANCE.isInitialized){
           synchronized(RetrofitClient::class){
               INSTANCE = Retrofit.Builder()
                   .baseUrl("http://localhost:3000/dev/api/item")
                   .client(httpClient.build())
                   .addConverterFactory(GsonConverterFactory.create())
                   .build()
           }

       }
        return INSTANCE
    }
}