package com.example.cryptoapp.data.network

import com.example.cryptoapp.data.model.detail.DetailModel
import com.example.cryptoapp.data.model.metadata.MetaModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface APIService {

    @GET("v1/cryptocurrency/listings/latest")
    suspend fun getCryptoMetaData(
        @Header("X-CMC_PRO_API_KEY") apiKey: String,
        @Query("limit") limit: String
    ): MetaModel

    @GET("v2/cryptocurrency/info")
    suspend fun getCryptoDetailData(
        @Header("X-CMC_PRO_API_KEY") apiKey: String,
        @Query("symbol") cryptoID: String
    ): DetailModel
}
