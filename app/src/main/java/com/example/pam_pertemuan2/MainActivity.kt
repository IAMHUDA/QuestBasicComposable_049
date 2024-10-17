package com.example.pam_pertemuan2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_pertemuan2.ui.theme.PAM_pertemuan2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAM_pertemuan2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BasicCompose(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp),
        verticalArrangement = Arrangement.spacedBy(2.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Login", fontSize = 30.sp, fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Yellow,
                    offset = Offset(4f, 4f),  // Mengatur offset shadow
                    blurRadius = 8f  // Mengatur seberapa buram bayangan
                )
            )
        )
        Text(text = "ini halaman Login", fontSize = 16.sp, fontStyle = FontStyle.Italic)
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(top = 20.dp)
        )
        Text(text = "Nama", fontSize = 12.sp)
        Text(text = "Miftahul huda", fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color(0xFFFFEB3B))
        Text(text = "20220140049", fontSize = 25.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Yellow,
                    offset = Offset(4f, 4f),  // Mengatur offset shadow
                    blurRadius = 8f  // Mengatur seberapa buram bayangan
                )
            ))
        Image(painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .size(700.dp)
                .clip(CircleShape)
                .shadow(
                    elevation = 10.dp,
                    shape = CircleShape,
                    ambientColor = Color.White,
                    spotColor = Color.White
                )
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAM_pertemuan2Theme {
        Greeting("Android")
    }
}