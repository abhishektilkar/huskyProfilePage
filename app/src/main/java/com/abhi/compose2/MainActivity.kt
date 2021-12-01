package com.abhi.compose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.abhi.compose2.ui.theme.Compose2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Compose2Theme {

                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {

                    // To calling profilepage to make TO
                    ProfilePage1()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
//    Text(text = "Hello $name my coustomvalue on screen to be a put!",
//        fontSize = 36.sp,
//        textAlign = TextAlign.Center) //
//}
//
////@Preview(showBackground = true) ////
//@Composable
//fun I(){
//    Text(text = "my coustomvalue on screen to be a put",
//        fontSize = 36.sp,
//        textAlign = TextAlign.Center) //
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    I()
//}