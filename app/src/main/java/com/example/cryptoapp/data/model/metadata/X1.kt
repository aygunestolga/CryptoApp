package com.example.cryptoapp.data.model.metadata

data class X1(
    val category: String,
    val date_added: String,
    val date_launched: String,
    val description: String,
    val id: Int,
    val logo: String,
    val name: String,
    val platform: Any,
    val slug: String,
    val symbol: String,
    val tags: List<String>,
    val urls: Urls
)