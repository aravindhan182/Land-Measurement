package com.example.landmeasurement.utils

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow
import kotlin.math.round


fun Double.scientificNotationToDecimal(): String {
    return BigDecimal(this).toPlainString()
}
fun BigDecimal.roundOf(scale: Int): BigDecimal {
    return setScale(scale, RoundingMode.HALF_EVEN)
}

fun countConsecutiveZeros(value: String): Int {
    val decimalPart = value.substringAfter(".") // Get the decimal part
    var zeroCount = 0

    for (char in decimalPart) {
        if (char == '0') {
            zeroCount++
        } else {
            break // Stop counting when a non-zero digit is encountered
        }
    }

    return zeroCount + 3
}