package com.example.day12viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.day12viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnSignIn.setOnClickListener {

            if (binding.checkBox4.isChecked){

                // Open a New Screen
        }else{
            binding.checkBox4.buttonTintList = ColorStateList.valueOf(Color.RED)
            Toast.makeText(this,"Please Accept the T&C",Toast.LENGTH_SHORT).show()
            }


        }

    }
}