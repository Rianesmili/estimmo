package com.example.estimmo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.estimmo.R
import com.example.estimmo.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)

        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_home, container, false)



        binding.ButtonStart.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_formulaireFragment)
        }
        return binding.root


    }
}