package com.example.landmeasurement.ui.measurement.calculation

import com.example.landmeasurement.ui.measurement.model.Units
import com.example.landmeasurement.utils.scientificNotationToDecimal

fun allMeasurement(enterUnits: String, input: Units, output: Units): CalculationView {

    return when {
        input == Units.SQUARE_FEET && output == Units.SQUARE_METER -> {
            val squareFeetToSquareMeter =
                (enterUnits.toDouble() * 0.092903).scientificNotationToDecimal()
            CalculationView(squareFeetToSquareMeter, null)
        }

        input == Units.ACRE && output == Units.SQUARE_METER -> {
            val acreToSquareMeter = (enterUnits.toDouble() * 4046.86).scientificNotationToDecimal()
            CalculationView(acreToSquareMeter, null)
        }

        input == Units.SQUARE_CENTIMETER && output == Units.SQUARE_METER -> {
            val squareCentimeterToSquareMeter =
                (enterUnits.toDouble() / 10000).scientificNotationToDecimal()
            CalculationView(squareCentimeterToSquareMeter, null)
        }

        input == Units.HECTARE && output == Units.SQUARE_METER -> {
            val hectareToSquareMeter = (enterUnits.toDouble() * 10000).scientificNotationToDecimal()
            CalculationView(hectareToSquareMeter, null)
        }

        input == Units.CENT && output == Units.SQUARE_METER -> {
            val centToSquareMeter = (enterUnits.toDouble() * 40.46).scientificNotationToDecimal()
            CalculationView(centToSquareMeter, null)
        }

        input == Units.SQUARE_METER && output == Units.SQUARE_FEET -> {
            val squareMeterToSquareFeet =
                (enterUnits.toDouble() * 10.764).scientificNotationToDecimal()
            CalculationView(squareMeterToSquareFeet, null)
        }

        input == Units.ACRE && output == Units.SQUARE_FEET -> {
            val acreToSquareFeet = (enterUnits.toDouble() * 43560).scientificNotationToDecimal()
            CalculationView(acreToSquareFeet, null)
        }

        input == Units.SQUARE_CENTIMETER && output == Units.SQUARE_FEET -> {
            val squareCentimeterToSquareFeet =
                (enterUnits.toDouble() * 0.0010764).scientificNotationToDecimal()
            CalculationView(squareCentimeterToSquareFeet, null)
        }

        input == Units.HECTARE && output == Units.SQUARE_FEET -> {
            val hectareToSquareFeet =
                (enterUnits.toDouble() * 107639.104167).scientificNotationToDecimal()
            CalculationView(hectareToSquareFeet, null)
        }

        input == Units.CENT && output == Units.SQUARE_FEET -> {
            val centToSquareFeet =
                (enterUnits.toDouble() * 435.6).scientificNotationToDecimal()
            CalculationView(centToSquareFeet, null)
        }

        input == Units.SQUARE_METER && output == Units.ACRE -> {
            val squareMeterToAcre =
                (enterUnits.toDouble() / 4046.85642).scientificNotationToDecimal()
            CalculationView(squareMeterToAcre, null)
        }

        input == Units.SQUARE_FEET && output == Units.ACRE -> {
            val acre = (enterUnits.toDouble() / 43560).scientificNotationToDecimal()
            CalculationView(acre, null)
        }

        input == Units.SQUARE_CENTIMETER && output == Units.ACRE -> {
            val squareCentimeter = (enterUnits.toDouble() / 40468564).scientificNotationToDecimal()
            CalculationView(squareCentimeter, null)
        }

        input == Units.HECTARE && output == Units.ACRE -> {
            val hectareToAcre = (enterUnits.toDouble() * 2.47105).scientificNotationToDecimal()
            CalculationView(hectareToAcre, null)
        }

        input == Units.CENT && output == Units.ACRE -> {
            val centToAcre = (enterUnits.toDouble() / 100).scientificNotationToDecimal()
            CalculationView(centToAcre, null)
        }

        input == Units.SQUARE_METER && output == Units.SQUARE_CENTIMETER -> {
            val squareMeterToSquareCentimeter =
                (enterUnits.toDouble() * 10000).scientificNotationToDecimal()
            CalculationView(squareMeterToSquareCentimeter, null)
        }

        input == Units.SQUARE_FEET && output == Units.SQUARE_CENTIMETER -> {
            val squareFeetToSquareCentimeter =
                (enterUnits.toDouble() * 929.0304).scientificNotationToDecimal()
            CalculationView(squareFeetToSquareCentimeter, null)
        }

        input == Units.ACRE && output == Units.SQUARE_CENTIMETER -> {
            val acreToSquareCentimeter =
                (enterUnits.toDouble()*40468.5642*10000).scientificNotationToDecimal()
            CalculationView(acreToSquareCentimeter, null)
        }

        input == Units.HECTARE && output == Units.SQUARE_CENTIMETER -> {
            val hectareToSquareCentimeter =
                (enterUnits.toDouble() * 10000000).scientificNotationToDecimal()
            CalculationView(hectareToSquareCentimeter, null)
        }

        input == Units.CENT && output == Units.SQUARE_CENTIMETER -> {
            val centToSquareCentimeter =
                (enterUnits.toDouble() * 404686).scientificNotationToDecimal()
            CalculationView(centToSquareCentimeter, null)
        }

        input == Units.SQUARE_METER && output == Units.HECTARE -> {
            val squareMeter = (enterUnits.toDouble() / 10000).scientificNotationToDecimal()
            CalculationView(squareMeter, null)
        }

        input == Units.SQUARE_FEET && output == Units.HECTARE -> {
            val squareFeetToHectare =
                (enterUnits.toDouble() / 107639.104167).scientificNotationToDecimal()
            CalculationView(squareFeetToHectare, null)
        }

        input == Units.ACRE && output == Units.HECTARE -> {
            val acreToHectare = (enterUnits.toDouble() * 0.404686).scientificNotationToDecimal()
            CalculationView(acreToHectare, null)
        }

        input == Units.SQUARE_CENTIMETER && output == Units.HECTARE -> {
            val squareCentimeterToHectare =
                (enterUnits.toDouble() / 10000000).scientificNotationToDecimal()
            CalculationView(squareCentimeterToHectare, null)
        }

        input == Units.CENT && output == Units.HECTARE -> {
            val centToHectare = (enterUnits.toDouble() * 0.00405).scientificNotationToDecimal()
            CalculationView(centToHectare, null)
        }

        input == Units.SQUARE_METER && output == Units.CENT -> {
            val squareMeterToCent = (enterUnits.toDouble() * 0.024).scientificNotationToDecimal()
            CalculationView(squareMeterToCent, null)
        }

        input == Units.SQUARE_FEET && output == Units.CENT -> {
            val squareFeetToCent = (enterUnits.toDouble() * 0.0023).scientificNotationToDecimal()
            CalculationView(squareFeetToCent, null)
        }

        input == Units.ACRE && output == Units.CENT -> {
            val acreToCent = (enterUnits.toDouble() * 100).scientificNotationToDecimal()
            CalculationView(acreToCent, null)
        }

        input == Units.SQUARE_CENTIMETER && output == Units.CENT -> {
            val squareCentimeterToCent =
                (enterUnits.toDouble() * 0.000002).scientificNotationToDecimal()
            CalculationView(squareCentimeterToCent, null)
        }

        input == Units.HECTARE && output == Units.CENT -> {
            val hectareToCent = (enterUnits.toDouble() * 247.13).scientificNotationToDecimal()
            CalculationView(hectareToCent, null)
        }

        else -> {
            CalculationView(null, "Something went wrong in calculation")
        }
    }
}

data class CalculationView(
    var result: String?,
    var calculationError: String?
)