package com.example.estimmo.data

import kotlinx.parcelize.Parcelize
import android.os.Parcelable as Parcelable

sealed interface PriceResult{
    object NotEstimated:PriceResult
    @JvmInline
    @Parcelize
    value class Estimated(val price:Double):PriceResult, Parcelable

}