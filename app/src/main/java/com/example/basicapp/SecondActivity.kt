package com.example.basicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("Second Activity", "Second Activity - onCreate Called")

        val backButton: Button = findViewById(R.id.btn_back)

        backButton.setOnClickListener {
//            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Second Activity", "Second Activity - onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Second Activity", "Second Activity - onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Second Activity", "Second Activity - onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Second Activity", "Second Activity - onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Second Activity", "Second Activity - onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Second Activity", "Second Activity - onDestroy Called")
    }
}