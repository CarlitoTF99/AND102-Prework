package com.example.helloword

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var startButton = findViewById<Button>(R.id.helloword_button)

        startButton.setOnClickListener(View.OnClickListener {
            Log.v("Hello world","Button Clicked")
            Toast.makeText(this@MainActivity, "Hello to you too!", Toast.LENGTH_SHORT).show()


        })
    }
}