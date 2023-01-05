package com.example.estimmo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.fragment.findNavController
import com.example.estimmo.databinding.FragmentFormulaireBinding
import com.example.estimmo.databinding.FragmentHomeBinding

class FormulaireFragment : Fragment() {

    private lateinit var binding: FragmentFormulaireBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_formulaire, container, false)

        binding = FragmentFormulaireBinding.bind(view)
/*
    val spinner: Spinner = binding.spinner

        val items = arrayOf("Item 1", "Item 2", "Item 3")

        val adapter = ArrayAdapter(requireActivity(), android.R.layout.simple_spinner_item, items)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Do nothing
            }
        }
 */




        binding.buttonEstimer.setOnClickListener{
            findNavController().navigate(R.id.action_formulaireFragment_to_homeFragment)
        }

        return view
    }

}