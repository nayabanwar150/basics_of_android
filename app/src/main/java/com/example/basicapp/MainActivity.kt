package com.example.basicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Main Activity", "Main Activity - onCreate Called")

        val btn: Button = findViewById(R.id.btn_next)

        btn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Main Activity", "Main Activity - onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main Activity", "Main Activity - onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Main Activity", "Main Activity - onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main Activity", "Main Activity - onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Main Activity", "Main Activity - onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main Activity", "Main Activity - onDestroy Called")
    }
}