package com.example.android

import android.os.Bundle
import android.text.Editable
import androidx.appcompat.app.AppCompatActivity

import com.example.android.databinding.ManActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ManActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ManActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        changeText();


    }

    fun changeText(){
        binding.button.setOnClickListener {
            val text= binding.inputText.text;
            binding.helloText.text = text;
            text.clear();
        }
    }
}
