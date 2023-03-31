package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()

//            Membuat Notifikasi

//
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text ="6"
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
//        val resultTextView: TextView = findViewById(R.id.textView)
        val diceImage: ImageView = findViewById(R.id.imageView)
        val drawableleResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val toast = Toast.makeText(this, "Dadu Dikocok", Toast.LENGTH_SHORT)
        toast.show()
        diceImage.setImageResource(drawableleResource)
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}