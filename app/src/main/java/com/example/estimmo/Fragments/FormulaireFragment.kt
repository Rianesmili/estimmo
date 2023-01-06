package com.example.estimmo.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.estimmo.R
import com.example.estimmo.databinding.FragmentFormulaireBinding
import com.example.estimmo.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import com.example.estimmo.backend.ImmoBackendInterface


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
        //Code parcelle spinner
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

            //pour recuprer l'id de l'element selectinné
            viewModel.parcelle = binding.spinnerParcelle.selectedItemPosition.toString()
            viewModel.type = binding.spinner.selectedItem.toString()









            //For the Condition

            val type_logement : String = binding.spinner.getSelectedItem().toString()

            val X1 = binding.superficieReel.text.toString().toDouble()
            val X2 = binding.nbrPieces.text.toString().toDouble()
            val X3  = binding.superficieTerrain.text.toString().toDouble()
            val X4 = binding.spinnerParcelle.selectedItemPosition.toDouble()

            if (type_logement.equals("Appartement")) {
                    //Si le choix est un appartement alors
                fun calculPriceApt(x1: Double, x2: Double, x3: Double, x4: Double): Double {

                    val coef1 = doubleArrayOf(0.00000000e+00,  8.26970326e+03, 3.21642464e+05,  2.54519530e+02,
                        1.73528223e+04, -3.09132103e+03 , 1.97105670e+00, -3.83197257e+02, -1.25830078e+02, -3.34302865e+02 , 5.69821496e+00)
                    val intercept1 = -234383.09085176938
                    val    equation = intercept1 + coef1[1]*x1 + coef1[2]*x2 + coef1[3]*x3 + coef1[4]*x4 + coef1[5]*x1*x2 + coef1[6]*x1*x3+ coef1[7]*x1*x4 + coef1[8]*x2*x3 + coef1[9]*x2*x4+ coef1[10]*x3*x4
                        return equation
                }
                val result = calculPriceApt(X1, X2, X3, X4)
                viewModel.estimation = result.toString()

                }else{
                    //Si le choix est une maison on lance cette fonction
                    fun calculPriceHome(x1: Double, x2: Double, x3: Double, x4: Double): Double {

                        val coef = doubleArrayOf(0.00000000e+00 , 1.50168101e+03,  1.82025034e+04,  1.06263368e+02,
                            -2.21840948e+02, -1.23017240e+02,  4.66231874e-01,  7.97807793e+00,
                            -2.32467828e+01, -9.86832447e+01,  2.80505641e-01)
                        val intercept = -14607.256792391738
                        val price = intercept + coef[1]*x1 + coef[2]*x2 + coef[3]*x3 + coef[4]*x4 + coef[5]*x1*x2 + coef[6]*x1*x3 + coef[7]*x1*x4 + coef[8]*x2*x3  + coef[9]*x2*x4 + coef[10]*x3*x4
                        return price
                    }
                val result = calculPriceHome(X1, X2, X3, X4)
                viewModel.estimation = result.toString()
            }




            findNavController().navigate(R.id.action_formulaireFragment_to_resultFragment)
        }
        return view
    }

}