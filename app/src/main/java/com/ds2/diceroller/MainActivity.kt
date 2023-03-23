package com.ds2.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "rolou um dado!", Toast.LENGTH_SHORT).show()
            class Dice (val numSides: Int) {
                fun roll(): Int {
                    return (1..numSides).random()
                }
            }
            fun rollDice() {
                val dice = Dice(6)
                val diceRoll = dice.roll()
                val diceImage: ImageView = findViewById(R.id.imageView5)

                val drawableResource = when (diceRoll) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
                diceImage.setImageResource(drawableResource)
            }
            rollDice()
        }
    }
}