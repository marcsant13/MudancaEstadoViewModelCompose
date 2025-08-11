package com.marcos.iconviewmodelcompose.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class TextFieldViewModel : ViewModel() {
    private var _textoDigitado: MutableState<String> = mutableStateOf("")
    val textoDigitado: State<String> = _textoDigitado

    fun captarTexto(texto: String){
        _textoDigitado.value = texto
    }

}