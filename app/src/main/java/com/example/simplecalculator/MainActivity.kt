package com.example.simplecalculator
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    private lateinit var tvDisplay: TextView
    private var currentInput = ""
    private var operator = ""
    private var firstValue = 0.0
    private var secondValue = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Initialize display
        tvDisplay = findViewById(R.id.tvDisplay)
        // Number buttons
        setNumberButtonListeners()
        // Operation buttons
        setOperationButtonListeners()
        // Clear button
        findViewById<Button>(R.id.btnClear).setOnClickListener {
            clear()
        }
        // Equals button
        findViewById<Button>(R.id.btnEquals).setOnClickListener {
            calculate()
        }
        // Decimal button
        findViewById<Button>(R.id.btnDecimal).setOnClickListener {
            appendDecimal()
        }
        // Delete button
        findViewById<Button>(R.id.btnDelete).setOnClickListener {
            deleteLastDigit()
        }
    }

    private fun deleteLastDigit() {
        if (currentInput.isNotEmpty()) {
            currentInput = currentInput.dropLast(1)
            tvDisplay.text = if (currentInput.isEmpty()) "0" else currentInput
        }
    }

    private fun setNumberButtonListeners() {
        val numberButtons = listOf(
            R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4,
            R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9
        )
        numberButtons.forEach { id ->
            findViewById<Button>(id).setOnClickListener { view ->
                val button = view as Button
                appendNumber(button.text.toString())
            }
        }
    }
    private fun setOperationButtonListeners() {
        findViewById<Button>(R.id.btnAdd).setOnClickListener {
            setOperation("+")
        }
        findViewById<Button>(R.id.btnSubtract).setOnClickListener {
            setOperation("-")
        }
        findViewById<Button>(R.id.btnMultiply).setOnClickListener {
            setOperation("*")
        }
        findViewById<Button>(R.id.btnDivide).setOnClickListener {
            setOperation("/")
        }
    }
    private fun appendNumber(number: String) {
        currentInput += number
        tvDisplay.text = currentInput
    }
    private fun appendDecimal() {
        if (currentInput.isEmpty()) {
            currentInput = "0."
        } else if (!currentInput.contains(".")) {
            currentInput += "."
        }
        tvDisplay.text = currentInput
    }
    private fun setOperation(op: String) {
        if (currentInput.isNotEmpty()) {
            firstValue = currentInput.toDouble()
            operator = op
            currentInput = ""
        }
    }
    private fun calculate() {
        if (currentInput.isNotEmpty() && operator.isNotEmpty()) {
            secondValue = currentInput.toDouble()
            val result = when (operator) {
                "+" -> firstValue + secondValue
                "-" -> firstValue - secondValue
                "*" -> firstValue * secondValue
                "/" -> if (secondValue != 0.0) firstValue / secondValue else 0.0
                else -> 0.0
            }
            tvDisplay.text = result.toString()
            currentInput = result.toString()
            operator = ""
        }
    }
    private fun clear() {
        currentInput = ""
        operator = ""
        firstValue = 0.0
        secondValue = 0.0
        tvDisplay.text = "0"
    }
}