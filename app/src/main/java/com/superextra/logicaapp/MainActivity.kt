package com.superextra.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCheck.setOnClickListener { checkAnswer() }

    }

    private fun checkAnswer() {

        var correctAnswers = 0

        if (answer1.text.toString() == getText(R.string.valT)) { correctAnswers += 1 }
        if (answer2.text.toString() == getText(R.string.valF)) { correctAnswers += 1 }
        if (answer3.text.toString() == getText(R.string.valF)) { correctAnswers += 1 }
        if (answer4.text.toString() == getText(R.string.valF)) { correctAnswers += 1 }

        Toast.makeText(this, getString(R.string.correct, correctAnswers), Toast.LENGTH_LONG).show()
    }
}
