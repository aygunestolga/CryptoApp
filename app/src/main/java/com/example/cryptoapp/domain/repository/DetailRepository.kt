package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.model.detail.DetailModel
import com.example.cryptoapp.util.Constants
import com.example.cryptoapp.util.Resource

interface DetailRepository {

    suspend fun getCryptoDetailData(
        apiKey: String = Constants.API_KEY,
        cryptoID: String
    ) : Resource<DetailModel>
}