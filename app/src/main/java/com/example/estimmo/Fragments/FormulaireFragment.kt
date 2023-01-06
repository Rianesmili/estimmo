package com.example.estimmo.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.estimmo.R
import com.example.estimmo.databinding.FragmentFormulaireBinding
import com.example.estimmo.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class FormulaireFragment : Fragment(R.layout.fragment_formulaire) {

    private lateinit var binding: FragmentFormulaireBinding
    private val viewModel: ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.fragment_formulaire, container, false)

        binding = FragmentFormulaireBinding.bind(view)

        // var shotType = binding.spinner

        val shotType = view?.findViewById<Spinner>(R.id.spinner)
        //creation du spinner pour choisir le type de bien Appartement ou Maison
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

        val typeParcelle = view?.findViewById<Spinner>(R.id.spinnerParcelle)
        //creation du spinner pour choisir la parcelle
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

            viewModel.superficie_reel = binding.superficieReel.text.toString()
            viewModel.superficie_terrain = binding.superficieTerrain.text.toString()
            viewModel.nombre_de_pieces = binding.nbrPieces.text.toString()

            viewModel.parcelle = binding.spinnerParcelle.selectedItemPosition.toString()
            viewModel.type = binding.spinner.selectedItem.toString()

            findNavController().navigate(R.id.action_formulaireFragment_to_resultFragment)
        }
        return view
    }

}