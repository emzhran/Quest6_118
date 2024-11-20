package com.example.latihanmvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.latihanmvvm.ui.view.screen.MahasiswaFormView
import com.example.latihanmvvm.ui.view.screen.SplashView
import com.example.latihanmvvm.ui.view.viewmodel.MahasiswaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel



enum class Halaman{
    Splash,
    Mahasiswa,
    Matakuliah,
    Tampil
}

@Composable
fun MahasiswaApp(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){
    val uiState = viewModel.statusUI.collectAsState()

    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name
    ){
        composable(
            route = Halaman.Splash.name
        ){
            SplashView(
                onMulaiButton = {
                    navController.navigate(Halaman.Mahasiswa.name)})
        }
        composable(route = Halaman.Mahasiswa.name) {
            MahasiswaFormView(
                onSubmitButtonClicked = {viewModel.saveDataMahasiswa(it)},
                onBackButtonClicked = {navController.popBackStack()}
            )
        }
    }
}