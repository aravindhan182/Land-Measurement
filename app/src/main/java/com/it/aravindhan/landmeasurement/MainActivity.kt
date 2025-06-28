package com.it.aravindhan.landmeasurement

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.it.aravindhan.landmeasurement.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}