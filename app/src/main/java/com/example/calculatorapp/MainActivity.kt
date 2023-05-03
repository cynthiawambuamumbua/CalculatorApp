package com.example.calculatorapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.icu.text.NumberingSystem
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView
import kotlinx.coroutines.DefaultExecutor.isEmpty
import java.lang.Double.toString
import java.lang.Integer.toString
//import kotlin..synthetic.main.activity_main.*
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.Arrays.toString
import kotlin.collections.EmptyList.isEmpty

private var Nothing?.input: String
    get() {}
    set() {}

class MainActivity : AppCompatActivity() {
    lateinit var editTextNumber1: TextView
    lateinit var editTextNumber: TextView
    lateinit var button:Button
    lateinit var button2: Button
    lateinit var button4: Button
    lateinit var button5: Button
    lateinit var textView2: TextView

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        editTextNumber=findViewById(R.id.editTextNumber2)


    }

    override fun onResume() {
        super.onResume()
        editTextNumber=findViewById(findViewById(R.id.editTextNumber))
        editTextNumber.setOnClickListener {
            val intent=Intent(this,editTextNumber::class.java)
            startActivity(intent)
        }

    }
}
    fun  inputIsNotEmpty(): Boolean {
        var b = true;
        val Number1 = null
        if (Number1.isEmpty()) {
            val input1 = null
            input1;error("Required")
//    input1.requestFocus()
            input1 = Number1
        }
        if (Number3.isEmpty()) {
            val input2 = Unit
        }
        val input2 = Unit
        input2;error("Required")
//    input2.requestFocus()
        input2 = Unit
    }

private fun Nothing?.isEmpty(): Boolean {

}


class Number3 {

}

class Number2 {

}


fun ADDITION(){
        if(inputIsNotEmpty()){
            val input1 = null
            var inputdata1=input1.toString().trim().toBigDecimal()
            val input2 = null
            var inputdata2=input2.toString().trim().toBigDecimal()
            val result = null
            result.input=inputdata1.add(inputdata2).toString()
        }
    }

    fun SUBTRACT(){
        if(inputIsNotEmpty()){
            val input1 = null
            var inputdata1=input1.toString().trim().toBigDecimal()
            val input2 = null
            var inputdata2=input2.toString().trim().toBigDecimal()
            val result = null
            result.input=inputdata1.subtract(inputdata2).toString();
        }
    }

    fun MULTIPLY(){
        if(inputIsNotEmpty()){
            val input1 = null
            var inputdata1=input1.toString().trim().toBigDecimal()
            val input2 = null
            var inputdata2=input2.toString().trim().toBigDecimal()
            val result = null
            result.input=inputdata1.multiply(inputdata2).toString()
        }
    }


    fun MODULUS() {
        if (inputIsNotEmpty()) {
            val input1 = null
            var inputdata1 = input1.toString().trim().toBigDecimal()
            var input2: String? = null
            var inputdata2 = input2.toString().trim().toBigDecimal()

            if (inputdata2.compareTo(BigDecimal.ZERO) == 0) {
                input2 = "invalid input"
            } else {
                val result = null
                result.input = inputdata1.divide(inputdata2, 2, RoundingMode.HALF_UP).toString();
            }
        }
    }





