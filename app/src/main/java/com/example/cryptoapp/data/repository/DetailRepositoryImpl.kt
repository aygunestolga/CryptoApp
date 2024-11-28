package com.example.cryptoapp.data.repository

import com.example.cryptoapp.data.model.detail.DetailModel
import com.example.cryptoapp.data.network.APIService
import com.example.cryptoapp.domain.repository.DetailRepository
import com.example.cryptoapp.util.Resource
import javax.inject.Inject

class DetailRepositoryImpl @Inject constructor(
    private val apiService: APIService
) : DetailRepository {

    override suspend fun getCryptoDetailData(
        apiKey: String,
        cryptoID: String
    ): Resource<DetailModel> {

        val response = try {
            apiService.getCryptoDetailData(apiKey, cryptoID)
        }
        catch (e: Exception) {
            return Resource.Error("Go Home Boy")
        }
        return Resource.Success(response)
    }
}
