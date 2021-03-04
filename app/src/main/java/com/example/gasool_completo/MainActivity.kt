package com.example.gasool_completo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : AppCompatButton = findViewById(R.id.button_calculate)
        button.setOnClickListener{
            Toast.makeText(this, "Cálculo Feito", Toast.LENGTH_LONG). show()
        }

    }
}