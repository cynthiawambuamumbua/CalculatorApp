package com.example.simplecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculatorapp.R


class MainActivity : AppCompatActivity() {
    var editTextNumber: EditText? = null
    var editTextNumber2: EditText? = null
    var ButtonMODULUS: Button? = null
    var ButtonADDITION: Button? = null
    var ButtonSUBTRACT: Button? = null
    var ButtonMULTIPLY: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var TextView: TextView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextNumber= findViewById(R.id.textView2)
        editTextNumber2= findViewById(R.id.textView2)
        ButtonADDITION = findViewById(R.id.Button)
        ButtonMODULUS = findViewById(R.id.Button)
        ButtonMULTIPLY = findViewById(R.id.Button)
        ButtonSUBTRACT= findViewById(R.id.Button)
        TextView= findViewById(R.id.textView2)
        Clicklistener()
    }

    fun Clicklistener() {
        ButtonADDITION!!.setOnClickListener {
            num1 = editTextNumber!!.text.toString().toDouble()
            num2 = editTextNumber2!!.text.toString().toDouble()
            val result = num1!! + num2!!
            TextView!!.text = result.toString()
        }
        ButtonSUBTRACT!!.setOnClickListener {
            num1 = editTextNumber!!.text.toString().toDouble()
            num2 = editTextNumber2!!.text.toString().toDouble()
            val result = num1!! - num2!!
            TextView!!.text = result.toString()
        }
        ButtonMULTIPLY!!.setOnClickListener {
            num1 = editTextNumber!!.text.toString().toDouble()
            num2 = editTextNumber2!!.text.toString().toDouble()
            val result = num1!! * num2!!
            TextView!!.text = result.toString()
        }
        ButtonMODULUS!!.setOnClickListener {
            num1 = editTextNumber!!.text.toString().toDouble()
            num2 = editTextNumber2!!.text.toString().toDouble()
            val result = num1!! / num2!!
            TextView!!.text = result.toString()
        }
    }
}




