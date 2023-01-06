package com.example.estimmo.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.estimmo.R
import com.example.estimmo.databinding.FragmentFormulaireBinding


class FormulaireFragment : Fragment(R.layout.fragment_formulaire) {

    private lateinit var binding: FragmentFormulaireBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {


        val view = inflater.inflate(R.layout.fragment_formulaire, container, false)

        binding = FragmentFormulaireBinding.bind(view)

        // var shotType = binding.spinner

        val shotType = view?.findViewById<Spinner>(R.id.spinner)
        this.context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.string_array,
                android.R.layout.simple_list_item_1
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                if (shotType != null) {
                    shotType.adapter = adapter
                }
            }
        }
        /*

        val typeBien = view?.findViewById<Spinner>(R.id.spinner)
        this.context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.string_array,
                android.R.layout.simple_list_item_1
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                if (typeBien != null) {
                    typeBien.adapter = adapter
                }
            }
        }

         */

        val typeParcelle = view?.findViewById<Spinner>(R.id.spinnerParcelle)
        this.context?.let {
            ArrayAdapter.createFromResource(
                it,
                R.array.string_array_parcelle,
                android.R.layout.simple_list_item_1
            ).also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                if (typeParcelle != null) {
                    typeParcelle.adapter = adapter
                }
            }
        }

        binding.buttonEstimer.setOnClickListener{
            findNavController().navigate(R.id.action_formulaireFragment_to_resultFragment)
        }
        return view
    }

}