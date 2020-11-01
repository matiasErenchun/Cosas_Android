package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.ActivityChooserView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice() }
        var countUp:Button = findViewById(R.id.Count_Up)
        //countUp.setOnClickListener{ countUp()}

    }

    private fun rollDice()
    {

        //val diceImage: ImageView = findViewById(R.id.dice_image)
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
       //Toast.makeText(this, "button clicked",Toast.LENGTH_SHORT).show()
        /*val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = randomInt.toString()
         */
    }

    /*
    private fun countUp()
    {
        val texto: TextView = findViewById(R.id.result_text)
        var newText: String = texto.text.toString()
        var newInt : Int = newText?.toIntOrNull() ?:0
        newInt++
        texto.text=newInt.toString()
    }
     */
}