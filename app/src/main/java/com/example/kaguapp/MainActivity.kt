package com.example.kaguapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kaguapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener{

        }

        binding.skipBtn.setOnClickListener{

        }
    }
}