package com.example.estimmo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.estimmo.databinding.FragmentFormulaireBinding


class FormulaireFragment : Fragment() {

    private lateinit var binding: FragmentFormulaireBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormulaireBinding.inflate(inflater)
        return binding.root
    }
}


