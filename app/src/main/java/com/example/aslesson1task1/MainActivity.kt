package com.example.aslesson1task1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var checkBox1: CheckBox
    private lateinit var checkBox2: CheckBox
    private lateinit var checkBox3: CheckBox
    private lateinit var switch1: Switch
    private lateinit var switch2: Switch

    private lateinit var toggleButton: ToggleButton
    private lateinit var finalButton: Button
    private lateinit var finalText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText_1)
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        switch1 = findViewById(R.id.switch1)
        switch2 = findViewById(R.id.switch2)
        toggleButton = findViewById(R.id.toggleButton)
        finalButton = findViewById(R.id.finalButton)
        finalText = findViewById(R.id.finalText)

        getYourForecast()
    }

    private fun getYourForecast() {
        finalText.text = " "
        finalButton.setOnClickListener{
            val userInput = editText1.text.toString()
            if (userInput == "5") {
                if (checkBox1.isChecked || checkBox2.isChecked || checkBox3.isChecked && toggleButton.isActivated) {
                    finalText.text = "Звезды говорят, что автор этого проекта получит 5 за домашнюю работу"
                } else {
                    finalText.text = "Звезды говорят, что вы выполнили не все условия гадания"
                }
            } else {
                finalText.text = "Звезды говорят, что вы ввели неправильное число"
            }
        }
    }
}