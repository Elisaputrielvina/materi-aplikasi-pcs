package com.pcs.apptoko.response.Produk


data class ProdukResponsePost(
    val `data`: DataProduk,
    val message: String,
    val success: Boolean
)

data class DataProduk (
    val `produk`: Produk
)
