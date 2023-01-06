package com.example.estimmo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.estimmo.R
import com.example.estimmo.databinding.FragmentHomeBinding
import com.example.estimmo.databinding.FragmentResultBinding

class ResultFragment : Fragment() {

    lateinit var binding : FragmentResultBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_result, container, false)

        binding = FragmentResultBinding.bind(view)

        binding.ButtonStart.setOnClickListener{
            findNavController().navigate(R.id.action_resultFragment_to_homeFragment)
        }
        return view


    }


}
