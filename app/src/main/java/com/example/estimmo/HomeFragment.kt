package com.example.estimmo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.estimmo.databinding.ActivityMainBinding
import com.example.estimmo.databinding.FragmentFormulaireBinding
import com.example.estimmo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        binding = FragmentHomeBinding.bind(view)

        binding.ButtonStart.setOnClickListener{
            findNavController().navigate(R.id.action_homeFragment_to_formulaireFragment)
        }
        return view


    }
}