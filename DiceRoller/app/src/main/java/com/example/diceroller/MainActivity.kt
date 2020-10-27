package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ActivityChooserView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice() }
        var countUp:Button = findViewById(R.id.Count_Up)
        countUp.setOnClickListener{ countUp()}

    }

    private fun rollDice()
    {
       //Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..100).random()
        resultText.text = randomInt.toString()
    }

    private fun countUp()
    {
        val texto: TextView = findViewById(R.id.result_text)
        var newText: String = texto.text.toString()
        var newInt : Int = newText?.toIntOrNull() ?:0
        newInt++
        texto.text=newInt.toString()
    }
}