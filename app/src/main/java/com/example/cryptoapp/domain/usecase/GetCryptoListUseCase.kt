package com.example.cryptoapp.domain.usecase

import com.example.cryptoapp.data.model.metadata.MetaModel
import com.example.cryptoapp.domain.repository.HomeRepository
import com.example.cryptoapp.util.Resource
import javax.inject.Inject

class GetCryptoListUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) {
    suspend fun execute() : Resource<MetaModel>{
        return homeRepository.getCryptoMetaData()
    }
}