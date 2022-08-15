package com.example.basicapp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicapp.R
import com.example.basicapp.databinding.ActivityBBinding
import com.example.basicapp.databinding.ActivityBaseBinding

class ActivityB : AppCompatActivity() {
    private lateinit var binding: ActivityBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        clickEvents()
    }

    private fun clickEvents(){
        binding.btnA.setOnClickListener {
            startActivity(Intent(this, ActivityA::class.java))
        }

        binding.btnB.setOnClickListener {
            startActivity(Intent(this, ActivityB::class.java))
        }

        binding.btnC.setOnClickListener {
            startActivity(Intent(this, ActivityC::class.java))
        }

        binding.btnD.setOnClickListener {
            startActivity(Intent(this, ActivityD::class.java))
        }
    }
}