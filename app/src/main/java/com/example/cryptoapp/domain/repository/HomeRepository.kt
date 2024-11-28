package com.example.cryptoapp.domain.repository

import com.example.cryptoapp.data.model.metadata.MetaModel
import com.example.cryptoapp.util.Constants
import com.example.cryptoapp.util.Resource

interface HomeRepository {

    suspend fun getCryptoMetaData(
        apiKey: String = Constants.API_KEY,
        limit: String = Constants.LIMIT
    ) : Resource<MetaModel>

}