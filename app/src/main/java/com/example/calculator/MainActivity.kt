package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // working of addition

        binding.additionButton.setOnClickListener{

            val firstNum = binding.editText.text.toString()

            binding.editText.setText("")

            binding.subtractButton.setOnClickListener{Toast.makeText(this, "complete this task first", Toast.LENGTH_LONG).show()}


            binding.equalToButton.setOnClickListener {
                val secondNum = binding.editText.text.toString()

                val result : Int  =  firstNum.toInt() + secondNum.toInt()

                binding.editText.setText("$firstNum + $secondNum = $result")
            }

        }

//        working of subtraction

        binding.subtractButton.setOnClickListener{

            val firstNum  = binding.editText.text.toString()

            binding.additionButton.setOnClickListener{Toast.makeText(this, "complete this task first", Toast.LENGTH_LONG).show()}

            binding.equalToButton.setOnClickListener{

                binding.editText.setText("")

                val secondNum = binding.editText.text.toString()

                val result : Int  =  firstNum.toInt() + secondNum.toInt()

                binding.editText.setText("$firstNum - $secondNum = $result")

            }

        }

    }
}