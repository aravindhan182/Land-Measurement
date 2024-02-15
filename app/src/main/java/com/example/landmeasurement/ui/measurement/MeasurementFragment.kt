package com.example.landmeasurement.ui.measurement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.landmeasurement.databinding.FragmentMeasurementBinding
import com.google.android.material.snackbar.Snackbar

class MeasurementFragment : Fragment() {
    private lateinit var binding: FragmentMeasurementBinding
    private val viewModel: MeasurementViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMeasurementBinding.inflate(layoutInflater, container, false).apply {
            lifecycleOwner = viewLifecycleOwner
        }
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.getMeasurementButton.setOnClickListener {
            viewModel.getValue()
        }
        viewModel.spinnerError.observe(viewLifecycleOwner, Observer {
            it.contentIfNotHandled()?.let { errorMessage ->
                Snackbar.make(requireView(), errorMessage, Snackbar.LENGTH_SHORT).show()
            }
        })
    }

}