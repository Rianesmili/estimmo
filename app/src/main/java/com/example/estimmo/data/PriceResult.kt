package com.example.estimmo.data

import kotlinx.parcelize.Parcelize
import android.os.Parcelable as Parcelable

sealed interface PriceResult: Parcelable{
    @Parcelize
    data class Estimated(val price:Double):PriceResult

    @Parcelize
    data class Failed(val faulty:Char):PriceResult

    @Parcelize
    object Empty: PriceResult

}