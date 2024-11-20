package com.example.latihanmvvm.ui.view.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.latihanmvvm.R

@Preview(showBackground = true)
@Composable
fun Matakuliah(){
    var selectedOption by remember { mutableStateOf("Option1") }
    Column(
        modifier = Modifier.fillMaxSize().background(color = colorResource(id = R.color.primary)),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = "Data MataKuliah",
                    color = Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(modifier = Modifier.fillMaxSize().background(color = Color.White,
            shape = RoundedCornerShape(topEnd = 15.dp, topStart = 15.dp)))
        {
            Column(modifier = Modifier.fillMaxSize().padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                Text(
                    text = "MataKuliah",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    fontSize = 27.sp
                )
                Row( verticalAlignment = Alignment.CenterVertically )
                { RadioButton( selected = selectedOption == "Option1",
                    onClick = { selectedOption = "Option1" } )
                    Text(text = "Pengembangan Aplikasi Web")
                }
                Row( verticalAlignment = Alignment.CenterVertically )
                { RadioButton( selected = selectedOption == "Option2",
                    onClick = { selectedOption = "Option2" } )
                    Text(text = "Pengembangan Aplikasi Web")
                }
                Row( verticalAlignment = Alignment.CenterVertically )
                { RadioButton( selected = selectedOption == "Option3",
                    onClick = { selectedOption = "Option3" } )
                    Text(text = "Pengembangan Aplikasi Web")
                }
            }
        }
    }
}