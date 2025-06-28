package com.it.aravindhan.landmeasurement.ui.measurement

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.landmeasurement.R
import com.it.aravindhan.landmeasurement.ui.measurement.calculation.CalculationView
import com.it.aravindhan.landmeasurement.ui.measurement.calculation.allMeasurement
import com.it.aravindhan.landmeasurement.ui.measurement.model.MutableErrorView
import com.it.aravindhan.landmeasurement.ui.measurement.model.MutableUnitView
import com.it.aravindhan.landmeasurement.ui.measurement.model.Units
import com.it.aravindhan.landmeasurement.utils.SingleEvent
import com.it.aravindhan.landmeasurement.utils.countConsecutiveZeros
import java.math.BigDecimal
import java.math.RoundingMode

class MeasurementViewModel(private val app: Application) : AndroidViewModel(app) {

    val selectedUnitForInput = MutableLiveData<Units>()

    val selectedUnitForOutput = MutableLiveData<Units>()

    private val _enterUnitValue = MutableLiveData(MutableUnitView())
    val enterUnitValue: LiveData<MutableUnitView> = _enterUnitValue

    private val _result: MutableLiveData<CalculationView> = MutableLiveData()
    val result: LiveData<CalculationView> = _result

    private val _enterUnitErrorView = MutableLiveData<MutableErrorView>()
    val enterUnitErrorView: LiveData<MutableErrorView> = _enterUnitErrorView

    private val _spinnerError: MutableLiveData<SingleEvent<String>> = MutableLiveData()
    val spinnerError: LiveData<SingleEvent<String>> = _spinnerError


    fun getValue() {
        when {
            selectedUnitForInput.value == selectedUnitForOutput.value -> {
                _spinnerError.value = SingleEvent(app.getString(R.string.select_different_unit))
            }

            _enterUnitValue.value?.enterUnit.isNullOrEmpty() -> {
                _enterUnitErrorView.value = MutableErrorView(app.getString(R.string.enter_the_unit))
            }

            else -> {

                var calculationView = allMeasurement(
                    context = app,
                    enterUnits = _enterUnitValue.value?.enterUnit!!,
                    input = selectedUnitForInput.value!!,
                    output = selectedUnitForOutput.value!!
                )

                val scale = countConsecutiveZeros(calculationView.result.toString())
                val result =
                    BigDecimal(calculationView.result).setScale(scale, RoundingMode.HALF_EVEN)
                calculationView =
                    CalculationView("Result: $result", calculationView.calculationError)
                _result.value = calculationView
            }
        }
    }
}
