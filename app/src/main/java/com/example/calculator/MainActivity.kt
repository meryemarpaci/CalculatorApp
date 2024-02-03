package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun toplaClick(view: View){
        val x = binding.number1.text.toString().toIntOrNull()
        val y = binding.number2.text.toString().toIntOrNull()
        if(x!=null && y!=null){
            binding.result.text=(x+y).toString()
        }else
            binding.result.text="Enter Number"
    }
    fun cikarClick(view: View){
        val x = binding.number1.text.toString().toIntOrNull()
        val y = binding.number2.text.toString().toIntOrNull()
        if(x!=null && y!=null){
            binding.result.text=(x-y).toString()
        }else
            binding.result.text="Enter Number"
    }
    fun carpClick(view: View){
        val x = binding.number1.text.toString().toIntOrNull()
        val y = binding.number2.text.toString().toIntOrNull()
        if(x!=null && y!=null){
            binding.result.text=(x*y).toString()
        }else
            binding.result.text="Enter Number"
    }
    fun bolClick(view: View){
        val x = binding.number1.text.toString().toDoubleOrNull()
        val y = binding.number2.text.toString().toDoubleOrNull()
        if(x!=null && y!=null){
            binding.result.text=(x/y).toString()
        }else
            binding.result.text="Enter Number"
    }

}