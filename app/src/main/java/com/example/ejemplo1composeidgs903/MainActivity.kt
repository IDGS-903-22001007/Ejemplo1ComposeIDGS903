package com.example.ejemplo1composeidgs903

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
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
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle


private val tarjetas: List<PersonajeTarjeta> = listOf(
    PersonajeTarjeta("Goku","El protagonista de la serie, conocido por su gran poder y personalidad amigable. Originalmente enviado a la Tierra como un infante volador con la misión de conquistarla. Sin embargo, el caer por un barranco le proporcionó un brutal golpe que si bien casi lo mata, este alteró su memoria y anuló todos los instintos violentos de su especie, lo que lo hizo crecer con un corazón puro y bondadoso, pero conservando todos los poderes de su raza. No obstante, en la nueva continuidad de Dragon Ball se establece que él fue enviado por sus padres a la Tierra con el objetivo de sobrevivir a toda costa a la destrucción de su planeta por parte de Freeza. Más tarde, Kakarot, ahora conocido como Son Goku, se convertiría en el príncipe consorte del monte Fry-pan y líder de los Guerreros Z, así como el mayor defensor de la Tierra y del Universo 7, logrando mantenerlos a salvo de la destrucción en innumerables ocasiones, a pesar de no considerarse a sí mismo como un héroe o salvador."),
    PersonajeTarjeta("Vegetta","Príncipe de los Saiyans, inicialmente un villano, pero luego se une a los Z Fighters. A pesar de que a inicios de Dragon Ball Z, Vegeta cumple un papel antagónico, poco después decide rebelarse ante el Imperio de Freeza, volviéndose un aliado clave para los Guerreros Z. Con el paso del tiempo llegaría a cambiar su manera de ser, optando por permanecer y vivir en la Tierra para luchar a su lado contra las inminentes adversidades que superar. Junto con Piccolo, él es de los antiguos enemigos de Goku que ha evolucionando al pasar de ser un villano y antihéroe, a finalmente un héroe a lo largo del transcurso de la historia, convirtiéndose así en el deuteragonista de la serie."),
    PersonajeTarjeta("Bulma","Bulma es la protagonista femenina de la serie manga Dragon Ball y sus adaptaciones al anime Dragon Ball, Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es hija del Dr. Brief y su esposa Panchy, hermana menor de Tights y una gran amiga de Son Goku con quien inicia la búsqueda de las Esferas del Dragón. En Dragon Ball Z tuvo a Trunks, primogénito de quien sería su esposo Vegeta, a su hija Bra[3] y su hijo adulto del tiempo alterno Trunks del Futuro Alternativo."),
    PersonajeTarjeta("Freezer","Freezer es el tirano espacial y el principal antagonista de la saga de Freezer."),
    PersonajeTarjeta("Cell","Cell conocido como Célula en España, es un bioandroide creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el Ejército del Listón Rojo, y con ello el sueño de todo villano: dominar el mundo. Es el antagonista principal del Arco de los Androides y Cell."),
    PersonajeTarjeta("Bills","Dios de la Destrucción Beerus, conocido también como Beers, o Bills en Hispanoamérica e inicialmente en España[1], es un personaje que fue introducido en la película Dragon Ball Z: La batalla de los dioses, donde es el antagonista principal de la película, y que aparece en el manga y anime de Dragon Ball Super como un personaje principal. Ocupa el puesto de Dios de la Destrucción de todo el Universo 7 siendo el lugar donde se desarrolla la historia de Dragon Ball."),
    PersonajeTarjeta("Whis","Whis es uno de los hijos del Gran Sacerdote, hermano menor de Vados, Korn y Kus. Es el ángel guía encargado de asistir y servir como maestro al Dios de la Destrucción del Universo 7, Beerus."),
    PersonajeTarjeta("Jiren","Jiren es un poderoso luchador del Universo 11 y uno de los oponentes más formidables en el torneo."),
    PersonajeTarjeta("Androide17","Es la hermana melliza del Androide Número 17 y una androide creada a partir de una base humana por el Dr. Gero con el único fin de destruir a Goku.")
)

data class PersonajeTarjeta(val title: String, val body: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjemploComposeIDGS903Theme {
                Tarjeta(tarjetas)
            }
        }
    }
}

@Composable
fun Tarjeta(personajes: List<PersonajeTarjeta>) {
    LazyColumn {
        items(personajes) { personaje ->
            MyPersonajes(personaje)
        }
    }
}

@Composable
fun MyPersonajes(personaje: PersonajeTarjeta) {

    Card(
        modifier=Modifier
            .padding(16.dp)
            .fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),



    ){


    }

    Row {
        ImagenHeroe()
        Personajes(personaje)
    }
}

@Composable
fun Personaje(name: String, color: Color, style: TextStyle) {
    Text(text = name)
}

@Composable
fun Personajes(personaje: PersonajeTarjeta) {
    Column {
        Personaje(
            personaje.title,
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.headlineMedium
        )
        Personaje(
            personaje.body,
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.typography.bodyLarge
        )
    }
}

@Composable
fun ImagenHeroe() {
    Image(
        painter = painterResource(R.drawable.goku_normal),
        contentDescription = "Goku",
        modifier = Modifier
            .padding(92.dp)
            .size(90.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
    )
}

@Preview
@Composable
fun PreviewPersonaje() {
    Tarjeta(tarjetas) // Pass the message list here for preview
}
