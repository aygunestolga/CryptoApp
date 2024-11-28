package com.example.cryptoapp.data.model.metadata

data class X1027(
    val category: String,
    val date_added: String,
    val date_launched: String,
    val description: String,
    val id: Int,
    val infinite_supply: Boolean,
    val logo: String,
    val name: String,
    val notice: Any,
    val platform: Any,
    val self_reported_circulating_supply: Any,
    val self_reported_market_cap: Any,
    val self_reported_tags: Any,
    val slug: String,
    val symbol: String,
    val tags: List<String>,
    val urls: UrlsX
)