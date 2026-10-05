package com.plcoding.cryptocurrencyappyt.domain.model

import com.google.gson.annotations.SerializedName

data class Coin(
    val isActive: Boolean? = null,
    val name: String? = null,
    val rank: Int? = null,
    val id: String? = null,
    val symbol: String? = null
)
