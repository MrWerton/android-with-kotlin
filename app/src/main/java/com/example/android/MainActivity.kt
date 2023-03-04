package com.example.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.example.android.databinding.ManActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ManActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ManActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}
