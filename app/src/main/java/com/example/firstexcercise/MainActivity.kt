package com.example.firstexcercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.firstexcercise.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var bmi = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            textNumber.text = bmi.toString()
            btnHitung.setOnClickListener {
                val beratBadan = binding.InputBB
                val tinggiBadan = binding.InputTB
                bmi = beratBadan.toString().toInt()/(tinggiBadan.toString().toInt()*tinggiBadan.toString().toInt())
                textNumber.text = bmi.toString()
            }

            btnToast.setOnClickListener {
                Toast.makeText(
                    this@MainActivity, "Count $bmi",
                    Toast.LENGTH_SHORT
                ).show()
            }


        }
    }
}