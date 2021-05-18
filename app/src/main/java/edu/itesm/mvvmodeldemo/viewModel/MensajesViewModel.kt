package edu.itesm.mvvmodeldemo.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import edu.itesm.mvvmodeldemo.model.MensajeModel
import edu.itesm.mvvmodeldemo.model.MensajesProvider

class MensajesViewModel : ViewModel() {
    val mensajesModelo = MutableLiveData<MensajeModel>()
    fun mensajeRandom(){
        val mensaje = MensajesProvider.randomMensaje()
        mensajesModelo.postValue(mensaje)
    }
}