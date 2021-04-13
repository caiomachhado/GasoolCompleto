package com.example.gasool_completo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView

private const val ADVANTAGE_COEFFICIENT: Double = 0.7

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

    private fun findViewByIds() {
        buttonCalculate = findViewById(R.id.button_calculate)
        editTextAlcohol = findViewById(R.id.edit_alcohol_value)
        editTextOil = findViewById(R.id.edit_oil_value)
        textViewResult = findViewById(R.id.text_view_result)
    }



    private fun calculateBestFuel() {
        val alcoholPrice = editTextAlcohol?.text.toString()
        val oilPrice = editTextOil?.text.toString()
        if(alcoholPrice.isNotEmpty() && oilPrice.isNotEmpty()){
            val result = alcoholPrice.toDouble() / oilPrice.toDouble()
            showResult(result)
        }else{
            Toast.makeText(applicationContext, "Campo em Branco!", Toast.LENGTH_LONG).show()
        }
    }

    private fun showResult(result: Double) {
        fun showResult(result: Double) {
            var text = if (result < ADVANTAGE_COEFFICIENT) "Alcool é melhor" else "Gasolina é melhor"
            textViewResult?.text = text
    }

}
