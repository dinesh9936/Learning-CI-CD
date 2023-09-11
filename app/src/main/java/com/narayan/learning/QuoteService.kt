package com.narayan.learning

import com.narayan.learning.models.Quotes
import com.narayan.learning.models.Result
import retrofit2.Response
import retrofit2.http.GET

interface QuoteService {

    @GET("/quotes")
    suspend fun getQuotes(): Response<Quotes>
}