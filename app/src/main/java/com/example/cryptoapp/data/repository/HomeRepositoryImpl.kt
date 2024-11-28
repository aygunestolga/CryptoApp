package com.example.cryptoapp.data.repository

import com.example.cryptoapp.data.model.metadata.MetaModel
import com.example.cryptoapp.data.network.APIService
import com.example.cryptoapp.domain.repository.HomeRepository
import com.example.cryptoapp.util.Resource
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val apiService: APIService
) : HomeRepository{

    override suspend fun getCryptoMetaData(
        apiKey: String,
        limit: String
    ): Resource<MetaModel> {

        val response = try {
            apiService.getCryptoMetaData(apiKey,limit)
        }catch (e : Exception){
            return Resource.Error("Go Home Baby")
        }
        return  Resource.Success(response)
    }
}