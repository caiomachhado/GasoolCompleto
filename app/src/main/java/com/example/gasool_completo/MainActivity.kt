package com.example.gasool_completo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView


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
                    val result = alcoholPrice.toDouble()/oilPrice.toDouble()
                    if(result < 0.7){
                        textViewResult.text = "Alcool é melhor"
                    }else{
                        textViewResult.text = "Gasolina é melhor!"
                    }


        }

    }
}