package com.pcs.apptoko.api

import com.pcs.apptoko.response.login.LoginResponse
import retrofit2.Call
import retrofit2.http.*

interface ApiEndpoint {
    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email : String,
        @Field("password") password : String
    ) : Call<LoginResponse>

    @GET("produk"
    fun getproduk(@Header("Authorization") token : String) : Call<ProdukResponse>

    @FormUrlEncoded@POST("produk")
            fun postProduk(
        @Header("Authorization") token : String,
        @Field("admin_id") admin_id : Int,
        @Field("harga") harga : Int,
            )
}