package com.example.estimmo

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.example.estimmo.databinding.FragmentFormulaireBinding


class FormulaireFragment : Fragment(R.layout.fragment_formulaire) {

    private lateinit var binding: FragmentFormulaireBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_formulaire, container, false)
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
        return view
    }

}