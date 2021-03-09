package com.example.gasool_completo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.widget.TextViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonFirstActivity : AppCompatButton = findViewById(R.id.button_calculate)
        val textView : AppCompatTextView = findViewById(R.id.text_view_result)



       buttonFirstActivity.setOnClickListener{

           val oilValue = edit_oil_value.text.toFloat()
           val alcoholValue = edit_alcohol_value.text.toFloat()

           var resultado = (oilValue * alcoholValue)
        }


        }

    }
}