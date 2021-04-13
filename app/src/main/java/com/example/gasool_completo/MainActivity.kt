package com.example.gasool_completo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView


class MainActivity : AppCompatActivity() {

    private var buttonCalculate: AppCompatButton? = null
    private var editTextAlcohol: AppCompatEditText? = null
    private var editTextOil: AppCompatEditText? = null
    private var textViewResult: AppCompatTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewByIds()
        buttonCalculate?.setOnClickListener {
            calculateBestFuel()
        }
    }

       private fun findViewByIds(){
          buttonCalculate = findViewById(R.id.button_calculate)
          editTextAlcohol = findViewById(R.id.edit_alcohol_value)
          editTextOil = findViewById(R.id.edit_oil_value)
          textViewResult = findViewById(R.id.text_view_result)
    }

    fun calculateBestFuel() {
        val alcoholPrice = editTextAlcohol.text.toString()
        val oilPrice = editTextOil.text.toString()
        val result = alcoholPrice.toDouble() / oilPrice.toDouble()
        if (result < 0.7) {
            textViewResult.text = "Álcool é melhor"
        } else {
            textViewResult.text = "Gasolina é melhor!"
        }

    }
}