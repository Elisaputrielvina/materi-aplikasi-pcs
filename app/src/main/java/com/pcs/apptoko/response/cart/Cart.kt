package com.pcs.apptoko.response.cart

import android.os.Parcelable

data class Cart(
    var id: Int,
    var harga: Int,
    var qty:Int
):Parcelable
