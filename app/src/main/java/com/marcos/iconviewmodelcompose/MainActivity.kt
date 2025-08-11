package com.marcos.iconviewmodelcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.marcos.iconviewmodelcompose.ui.theme.IconViewModelComposeTheme
import com.marcos.iconviewmodelcompose.viewmodel.IconViewModel
import com.marcos.iconviewmodelcompose.viewmodel.TextFieldViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IconViewModelComposeTheme {
                AppIcon()
            }
        }
    }
}

@Composable
@Preview
fun AppIcon() {

    val viewModelIcon: IconViewModel = viewModel()
    val textFieldViewModel: TextFieldViewModel = viewModel()

    val stateImage = viewModelIcon.imageIcon.value
    var textoDigitado = textFieldViewModel.textoDigitado.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Blue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .size(96.dp)
                .clickable(onClick = { viewModelIcon.mudarEstado() }),
            painter = painterResource(stateImage),
            contentDescription = null
        )
        TextField(
            value = textoDigitado,
            onValueChange = { it: String -> textFieldViewModel.captarTexto(it) },
            label = { Text("Digite algo") }
        )
    }
}