package com.example.estimmo.backend

import javax.inject.Inject


class ImmoBackendImpl @Inject constructor():ImmoBackendInterface{

    override fun calculPriceHome(x1: Double, x2: Double, x3: Double, x4: Double): Double {
        val coef = doubleArrayOf(0.0, 1337.33905, 18442.7549, 88.8857886, -73.1976145, -130.13074, 0.397920667, 17.5122482, -14.7366072, -216.105674, 0.604713373)
        val intercept = -3090.8531835110043
        val price = intercept + coef[1]*x1 + coef[2]*x2 + coef[3]*x3 + coef[4]*x4 + coef[5]*x1*x2 + coef[6]*x1*x3 + coef[7]*x1*x4 + coef[8]*x2*x3  + coef[9]*x2*x4 + coef[10]*x3*x4
        return price
    }

    override fun calculPriceApt(x1: Double, x2: Double, x3: Double, x4: Double): Double {
        val coef1 = doubleArrayOf(0.0, 8269.70326, 32164.2464, 25.4519530, 17352.8223, -3091.32103, 1.97105670, -383.197257, -125.830078, -334.302865, 5.69821496)
        val intercept1 = -234383.09085176938
        val price1 = intercept1 + coef1[1] * x1 + coef1[2] * x2 + coef1[3] * x3 + coef1[4] * x4 + coef1[5] * x1 * x2 + coef1[6] * x1 * x3 + coef1[7] * x1 * x4 + coef1[8] * x2 * x3 + coef1[9] * x2 * x4 + coef1[10] * x3 * x4
        return price1
    }



}