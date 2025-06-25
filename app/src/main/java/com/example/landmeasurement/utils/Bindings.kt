
package com.example.landmeasurement.utils

import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import com.example.landmeasurement.R
import com.example.landmeasurement.ui.measurement.model.Units


@BindingAdapter("app:selectedUnit")
fun setSpinnerSelectedUnit(spinner: Spinner, selectedUnit: MutableLiveData<Units>?) {
    selectedUnit?.value?.let { unit ->
        val unitArray = spinner.context.resources.getStringArray(R.array.unit_array)
        val position = unitArray.indexOf(unit.name)
        if (position != -1) {
            spinner.setSelection(position)
        }
    }

    spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
        override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
            selectedUnit?.value = Units.values()[position]
        }

        override fun onNothingSelected(parentView: AdapterView<*>?) {

        }
    }
}