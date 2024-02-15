package com.example.landmeasurement.ui.measurement

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.landmeasurement.ui.measurement.calculation.CalculationView
import com.example.landmeasurement.ui.measurement.calculation.allMeasurement
import com.example.landmeasurement.ui.measurement.model.MutableErrorView
import com.example.landmeasurement.ui.measurement.model.MutableUnitView
import com.example.landmeasurement.ui.measurement.model.Units
import com.example.landmeasurement.utils.SingleEvent

class MeasurementViewModel(app: Application) : AndroidViewModel(app) {

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
                _spinnerError.value = SingleEvent("Select different unit for output")
            }

            _enterUnitValue.value?.enterUnit.isNullOrEmpty() -> {
                _enterUnitErrorView.value = MutableErrorView("Enter the unit")
            }

            else -> {

                var calculationView = allMeasurement(
                    _enterUnitValue.value?.enterUnit!!,
                    selectedUnitForInput.value!!,
                    selectedUnitForOutput.value!!
                )
                val resultPrefix= "Result: "
                calculationView = CalculationView("$resultPrefix${calculationView.result}",calculationView.calculationError)
                _result.value = calculationView
            }
        }
    }
}
