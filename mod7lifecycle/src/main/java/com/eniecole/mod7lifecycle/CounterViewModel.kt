package com.eniecole.mod7lifecycle

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    //Cette donnée n'est pas observable
    //var counter = 0
    //Cette donnée pourra être observée
    var counter = MutableLiveData(0)
    fun inc(){
        //On ne fait qu'incrémenter un entier
        //++counter
        //Ici on incrémenter la valeur du compteur mais on avertit les observers
        counter.value = counter.value?.inc()
    }
    fun dec(){ counter.value = counter.value?.dec() }
}