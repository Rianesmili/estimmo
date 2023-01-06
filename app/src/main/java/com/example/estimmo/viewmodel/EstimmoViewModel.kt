package com.example.estimmo.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.estimmo.backend.ImmoBackendInterface
import com.example.estimmo.data.PriceResult
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

val map = mapOf(
    "AB" to 0, "AC" to 1, "AD" to 2, "AE" to 3, "AH" to 4, "AI" to 5, "AK" to 6, "AO" to 7, "AP" to 8, "AR" to 9, "AS" to 10, "AT" to 11, "AV" to 12, "AW" to 13,
    "AX" to 14, "AY" to 15, "AZ" to 16, "BC" to 17, "BD" to 18, "BE" to 19, "BH" to 20, "BK" to 21,
    "BL" to 22, "BM" to 23, "BO" to 24, "BP" to 25, "BR" to 26, "BS" to 27, "BT" to 28, "BV" to 29, "BW" to 30
)
@HiltViewModel
class EstimmoViewModel @Inject constructor(
    state:SavedStateHandle,
    private val immoBackend:ImmoBackendInterface)
 : ViewModel() {
     private val _priceResult:MutableLiveData <PriceResult> =state.getLiveData("state_price_result",PriceResult.Empty)
     val priceResult:LiveData<PriceResult> = _priceResult

    fun estim(parcelle:String,nbchambre:Double,terrain:Double,superficie:Double,type:String){

        val id_parcelle = map.get(parcelle)







    }




}