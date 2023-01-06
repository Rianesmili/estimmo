package com.example.estimmo.backend

import javax.inject.Inject


class ImmoBackendImpl @Inject constructor():ImmoBackendInterface{

    override fun calculPriceHome(x1: Double, x2: Double, x3: Double, x4: Double): Double {

        val coef = doubleArrayOf(0.00000000e+00 , 1.50168101e+03,  1.82025034e+04,  1.06263368e+02,
            -2.21840948e+02, -1.23017240e+02,  4.66231874e-01,  7.97807793e+00,
            -2.32467828e+01, -9.86832447e+01,  2.80505641e-01)
        val intercept = -14607.256792391738
        val price = intercept + coef[1]*x1 + coef[2]*x2 + coef[3]*x3 + coef[4]*x4 + coef[5]*x1*x2 + coef[6]*x1*x3 + coef[7]*x1*x4 + coef[8]*x2*x3  + coef[9]*x2*x4 + coef[10]*x3*x4
        return price
    }

    override fun calculPriceApt(x1: Double, x2: Double, x3: Double, x4: Double): Double {
        val coef1 = doubleArrayOf(0.00000000e+00,  8.26970326e+03, 3.21642464e+05,  2.54519530e+02,
            1.73528223e+04, -3.09132103e+03 , 1.97105670e+00, -3.83197257e+02, -1.25830078e+02, -3.34302865e+02 , 5.69821496e+00)
        val intercept1 = -234383.09085176938
        val    equation = intercept1 + coef1[1]*x1 + coef1[2]*x2 + coef1[3]*x3 + coef1[4]*x4 + coef1[5]*x1*x2 + coef1[6]*x1*x3+ coef1[7]*x1*x4 + coef1[8]*x2*x3 + coef1[9]*x2*x4+ coef1[10]*x3*x4
        return equation
    }



}