package com.example.gasool_completo

import android.content.Intent
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
        val textView : AppCompatTextView = findViewById(R.id.text_view_result)

        button.setOnClickListener{
            val intent = Intent(this, CombustivelActivity::class.java)
            startActivity(intent)
        }


    }
}