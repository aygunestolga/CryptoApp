package com.example.cryptoapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.cryptoapp.data.model.detail.DetailModel
import com.example.cryptoapp.domain.usecase.GetCryptoDetailUseCase
import com.example.cryptoapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val getCryptoDetailUseCase: GetCryptoDetailUseCase
) : ViewModel() {

    suspend fun loadCryptoDetailData(
        cryptoID : String
    ) : Resource<DetailModel>{
        return getCryptoDetailUseCase.execute(cryptoID)
    }
}