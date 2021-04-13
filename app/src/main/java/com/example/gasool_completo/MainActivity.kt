package com.example.gasool_completo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat
import androidx.

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonCalculate : AppCompatButton = findViewById(R.id.button_calculate)
        val editTextAlcohol : AppCompatEditText = findViewById(R.id.edit_alcohol_value)
        val editTextOil : AppCompatEditText = findViewById(R.id.edit_oil_value)
        val textViewResult : AppCompatTextView = findViewById(R.id.text_view_result)


                buttonCalculate.setOnClickListener{
                    val alcoholPrice = editTextAlcohol.text.toString()
                    val oilPrice = editTextOil.text.toString()
                    val result = alcoholPrice.toDouble()

                }


        }

    }
}