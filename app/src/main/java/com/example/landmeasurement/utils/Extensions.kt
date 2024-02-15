package com.example.landmeasurement.utils

import kotlin.math.pow
import kotlin.math.round


fun Double.scientificNotationToDecimal(): String {
    return String.format("%.15f", this)
}
fun roundToDecimalPlaces(value: Double, decimalPlaces: Int): Double {
    val multiplier = 10.0.pow(decimalPlaces)
    return round(value * multiplier) / multiplier
}