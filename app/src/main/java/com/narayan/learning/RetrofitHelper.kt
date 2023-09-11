package com.narayan.learning

import com.narayan.learning.BuildConfig.API_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitHelper {
    private val okHttpClient: OkHttpClient = OkHttpClient.Builder().callTimeout(1, TimeUnit.MINUTES)
        .writeTimeout(1,TimeUnit.MINUTES)
        .build()
    fun getInstance(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl(API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

}