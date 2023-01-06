package com.example.estimmo.backend

interface ImmoBackendInterface {
    fun calculPriceHome(x1: Double, x2: Double, x3: Double, x4: Double): Double
    fun calculPriceApt(x1: Double, x2: Double, x3: Double, x4: Double): Double

}