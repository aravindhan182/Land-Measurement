package com.example.landmeasurement.utils

import java.math.BigDecimal
import kotlin.math.pow
import kotlin.math.round


fun Double.scientificNotationToDecimal(): String {
    return BigDecimal(this).toPlainString()
}
fun roundToDecimalPlaces(value: Double, decimalPlaces: Int): Double {
    val multiplier = 10.0.pow(decimalPlaces)
    return round(value * multiplier) / multiplier
}