package com.example.gasool_completo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : AppCompatButton = findViewById(R.id.button_calculate)
        val textViewResult : AppCompatTextView = findViewById(R.id.text_view_result)

        button.setOnClickListener{
            Toast.makeText(this, "Cálculo Feito", Toast.LENGTH_LONG). show()
            textViewResult.text = "O cálculo foi armazenado."
        }

    }
}