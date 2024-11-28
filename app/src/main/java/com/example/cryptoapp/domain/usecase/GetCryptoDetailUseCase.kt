package com.example.cryptoapp.domain.usecase

import com.example.cryptoapp.data.model.detail.DetailModel
import com.example.cryptoapp.domain.repository.DetailRepository
import com.example.cryptoapp.util.Resource
import javax.inject.Inject

class GetCryptoDetailUseCase @Inject constructor(
    private val detailRepository: DetailRepository
) {
    suspend fun execute(
        cryptoID: String
    ) : Resource<DetailModel>{
        return detailRepository.getCryptoDetailData(cryptoID = cryptoID)
    }
}