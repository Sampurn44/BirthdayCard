package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    BirthdayGreetingWithText(message = "Happy Birthday Dev!", from = "from Riddhima")
                }

            }
        }
    }
}
@Composable
fun BirthdayGreetingWithText(message: String,from: String){
    Column {
        Text(text = message, fontSize = 36.sp
        , modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 24.dp))
        Text(text = from, fontSize = 24.sp
            , modifier = Modifier.fillMaxWidth().wrapContentWidth(align = Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 5.dp))
    }

}
@Preview(showBackground = true)
@Composable
fun BirthdayGreetingWithTextPreview() {
    BirthdayCardTheme {
        BirthdayGreetingWithText(message = "Happy Birthday Dev!", from = "from Riddhima")
    }
}