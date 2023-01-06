package com.example.estimmo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.estimmo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
        override fun onCreate ( savedInstanceState : Bundle ?) {
            super.onCreate ( savedInstanceState )
            val binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView (binding.root)
        }

    }
