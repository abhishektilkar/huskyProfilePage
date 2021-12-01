package com.abhi.compose2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun ProfilePage1(){
    Card(elevation = 6.dp,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp, bottom = 100.dp, start = 16.dp, end = 16.dp)
            .border(width = 2.dp, color = Color.White, shape = RoundedCornerShape(36.dp))
    ) {
        ConstraintLayout {

//            val (image) = createRef()
            // Image
            Image(painter = painterResource(id = R.drawable.imrage),
                contentDescription = "image",
                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Red,
                        shape = CircleShape
                    ),
                contentScale = ContentScale.Crop
            )


            // Text
            Text(text = "imrage",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                fontSize = 19.sp)
            Text(text = "IndiA")



            // followersi posts following
            Row(horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            )
            {

                ProfileStatusI1(150,"followersi")
                ProfileStatusI1(100,"following")
                ProfileStatusI1(36,"Posts")

            }

            // Button follow user and MessaGE
            Row(horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "follow user")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Message")
                }

            }



        }
    }
}


@Composable
fun ProfileStatusI1(count : Int, title : String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count.toString(), fontWeight = FontWeight.Bold)
        Text(text = title) //"followersi" //
    }
}


@Preview (showBackground = true)
@Composable
fun ProfilePagePreview1() {
    ProfilePage1()
}