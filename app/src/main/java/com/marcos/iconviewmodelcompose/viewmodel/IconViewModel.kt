package com.marcos.iconviewmodelcompose.viewmodel

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.marcos.iconviewmodelcompose.R

class IconViewModel : ViewModel() {
    private var estadoIcone = true
    private var _imageIcon = mutableStateOf(R.drawable.mdi_light__eye)
    val imageIcon: State<Int> = _imageIcon

    fun mudarEstado(){
        estadoIcone = !estadoIcone
        if (estadoIcone){
            _imageIcon.value = R.drawable.mdi_light__eye
        }else{
            _imageIcon.value = R.drawable.mdi_light__eye_off
        }
    }
}