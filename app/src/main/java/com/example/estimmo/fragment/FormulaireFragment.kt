package com.example.estimmo.fragment

import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.estimmo.databinding.FragmentFormulaireBinding
import com.example.estimmo.viewmodel.EstimmoViewModel


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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val immoViewModel:EstimmoViewModel by viewModels ()
        binding.buttonEstimer.setOnClickListener{
            immoViewModel.estim(binding.parcelle.text.toString(),binding.nbchambre.text.toString().toDouble(),binding.surfaceTerrain.text.toString().toDouble(),binding.surfaceMaison.text.toString().toDouble(),binding.spinner.selectedItem.toString())
        }
    }


}


