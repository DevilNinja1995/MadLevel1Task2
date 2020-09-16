package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // Sets the activity layout resource file.

        // Using the id given in the layout file you can access the component.
        // Set an action when the user clicks on the confirm button.
        binding.btnSubmit.setOnClickListener {
            checkAnswers()
        }
    }

    private fun checkAnswers() {
        var answer1 = binding.etAnswer1.text.toString()
        var answer2 = binding.etAnswer2.text.toString()
        var answer3 = binding.etAnswer3.text.toString()
        var answer4 = binding.etAnswer4.text.toString()
        var count = 0

        if (answer1 == getString(R.string.answer1)){
            count++
        }
        if (answer2 == getString(R.string.answer2)){
            count++
        }
        if (answer3 == getString(R.string.answer3)){
            count++
        }
        if (answer4 == getString(R.string.answer4)){
            count++
        }

        Toast.makeText(this,"You have enter "+ count + " out 4 answers correct", Toast.LENGTH_LONG).show()

    }
}