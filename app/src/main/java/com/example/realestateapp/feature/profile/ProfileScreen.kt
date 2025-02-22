package com.example.realestateapp.feature.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestateapp.R
import com.example.realestateapp.ui.components.TopBar

@Composable
fun ProfileScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(R.color.lightGrey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item { TopBar(onBack = { navController.navigateUp() }) }
    }
}

@Preview
@Composable
fun ProfileScreenPreview(){
    val navController = rememberNavController()
    ProfileScreen(navController = navController)
}