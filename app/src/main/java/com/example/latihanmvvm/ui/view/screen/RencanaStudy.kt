package com.example.latihanmvvm.ui.view.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.latihanmvvm.model.Mahasiswa

@Composable
fun RencanaStudy(
    mahasiswa: Mahasiswa,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    onBackButtonClicked: () -> Unit
){
    var chosenDropDown by remember {
        mutableStateOf("")
    }
    var checked by remember { mutableStateOf(false) }
    var pilihanKelas by remember { mutableStateOf("") }
    var listData : MutableList<String> = mutableListOf(chosenDropDown, pilihanKelas)
}