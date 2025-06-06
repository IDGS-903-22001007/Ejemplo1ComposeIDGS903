package com.example.ejemplo1composeidgs903

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import android.os.Bundle
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.draw.clip

import com.example.ejemplo1composeidgs903.ui.theme.Ejemplo1ComposeIDGS903Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                Tarjeta()
            
        }
    }
}
@Composable
fun Tarjeta(){
    Row {
        ImagenHeroe()
        Personaje()
    }
}

@Composable
fun Personaje() {
    Column {
        Text("Gohan")
        Text("Son Goku")
    }
}

@Composable
fun ImagenHeroe() {
    Image(
        painter = painterResource(R.drawable.goku_normal),
        contentDescription = "Goku",
        modifier = Modifier
            .padding(92.dp)
            .size(100.dp)
            .clip(CircleShape)
            .background(Color.Gray)
    )
}

@Preview
@Composable
fun PreviewPersonaje() {
      Tarjeta()
}
