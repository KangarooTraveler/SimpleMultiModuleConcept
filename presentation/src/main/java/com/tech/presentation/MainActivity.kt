package com.tech.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tech.presentation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = (application as ProvideViewModel).viewModel()
        viewModel.liveData.observe(this) {
            binding.textView.text = it
        }
        viewModel.load()
    }
}