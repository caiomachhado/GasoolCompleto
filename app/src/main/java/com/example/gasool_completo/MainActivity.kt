package com.example.gasool_completo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
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
        if(isValid(alcoholPrice, oilPrice)){
            val result = alcoholPrice.toDouble()/oilPrice.toDouble()
            showResult(result)
        }
    }

    private fun isValid(alcohol: String, oil:String) : Boolean {
        var result = true
        if(alcohol.isEmpty() && oil.isEmpty()){
            result = false
            editTextAlcohol?.error = getString(R.string.emptyFiel)
            editTextOil?.error = getString(R.string.emptyFiel)
        }else if (alcohol.isEmpty()) {
            result = false
            editTextAlcohol?.error = getString(R.string.emptyFiel)
        } else if (oil.isEmpty()) {
            result = false
            editTextOil?.error = getString(R.string.emptyFiel)
        }
        return result
    }

    private fun showResult(result: Double) {
            var text = if (result < ADVANTAGE_COEFFICIENT) getString(R.string.bestAlcohol) else getString(R.string.bestOil)
            textViewResult?.text = text
        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item_consume -> getToConsumeActivity()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getToConsumeActivity() {
        val intent = Intent(this, ConsumeActivity::class.java)
        startActivity(intent)
    }

}

