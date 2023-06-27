package com.example.tarefa_concluida

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarefa_concluida.ui.theme.Tarefa_concluidaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarefa_concluidaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Dados()
                }
            }
        }
    }
}

@Composable
fun Dados(){
    Tarefa(
    tarefa= stringResource(id = R.string.tarefa_concluida),
    concluida= stringResource(id = R.string.bom_trabalho),
    imagem= painterResource(id = R.drawable.ic_task_completed)
    )
}

@Composable
fun Tarefa(
    tarefa:String,
    concluida:String,
    imagem:Painter
){
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = imagem, contentDescription = null)
        Text(
            text = tarefa,
            Modifier
                .padding(top = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = concluida, fontSize = 16.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tarefa_concluidaTheme {
        Dados()
    }
}