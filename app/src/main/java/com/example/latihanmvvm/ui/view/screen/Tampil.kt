package com.example.latihanmvvm.ui.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.latihanmvvm.R
import com.example.latihanmvvm.model.Mahasiswa
import com.example.latihanmvvm.model.RencanaStudi


@Composable
fun Tampil(
    mahasiswa: Mahasiswa,
    krs : RencanaStudi,
    onResetButtonClicked: () -> Unit,
    OnBackButtonClicked: () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.primary)), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.padding(top = 14.dp))
        Row(modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = R.drawable.umy), contentDescription = "",
                modifier = Modifier.size(40.dp))
        }
    }
}