package com.flashcom.meetup3.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitAPI {

    val base_url = "https://www.thesportsdb.com/api/v1/json/1/"
    fun baseURL(): RetrofitClient {
        val client =
            Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        return client.create(RetrofitClient::class.java)
    }

}