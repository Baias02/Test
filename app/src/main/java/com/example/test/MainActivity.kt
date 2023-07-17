package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initDivision()
    }

    private fun initDivision() {
        with(binding){
            buttonCal.setOnClickListener{
                result.text = Test().division(EditA.text.toString(),EditB.text.toString() )
            }
        }
    }
}