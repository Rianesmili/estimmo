package com.example.estimmo.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.estimmo.R
import com.example.estimmo.databinding.FragmentHomeBinding
import com.example.estimmo.databinding.FragmentResultBinding
import com.example.estimmo.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResultFragment : Fragment() {

    lateinit var binding : FragmentResultBinding

    private val viewModel : ViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentResultBinding.inflate(layoutInflater)
        binding.BackStart.setOnClickListener{
            findNavController().navigate(R.id.action_resultFragment_to_homeFragment)
        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val superficie_reel = viewModel.superficie_reel
        val superficie_terrain = viewModel.superficie_terrain
        val nbr_pieces =viewModel.nombre_de_pieces
        val type_parcelle = viewModel.parcelle
        val type = viewModel.type
        val estimation = viewModel.estimation


        binding.superficieReel.text = "Superficie réel : $superficie_reel"
        binding.superficieTerrain.text = "Superficie Terrain : $superficie_terrain"
        binding.nbrPieces.text ="Nombre de piéces : $nbr_pieces"
        binding.codeParcelle.text = "Code Parcelle : $type_parcelle"
        binding.type.text= "Type : $type"
        binding.estimation.text= "$estimation"
    }


}
