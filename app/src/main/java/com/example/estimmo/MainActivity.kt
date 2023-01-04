package com.example.estimmo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.estimmo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.startButton.setOnClickListener{
            Toast.makeText(this@MainActivity, "Bienvenue a EST'IMMO", Toast.LENGTH_LONG).show()
            /*
            val intent = Intent(this@MainActivity, MainActivity::class.java)
            startActivity(intent)
             */


        }
    }
}