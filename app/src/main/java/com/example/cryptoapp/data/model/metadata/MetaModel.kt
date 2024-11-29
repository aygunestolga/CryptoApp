package com.example.cryptoapp.data.model.metadata

import com.google.gson.annotations.SerializedName

data class MetaModel(
    @SerializedName("data")
    val `data`: List<CryptoMetaData>,
    @SerializedName("status")
    val status: CryptoMetaDataStatusResponse
)