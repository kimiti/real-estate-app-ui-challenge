package com.example.realestateapp.core.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.realestateapp.R

@Composable
fun BottomBar(
    navController: NavController,
    modifier: Modifier = Modifier
){
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDest = backStackEntry?.destination

    NavigationBar(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(50.dp))
        .background(colorResource(R.color.black))
        .height(70.dp)
        .padding(4.dp),
        containerColor = Color.Transparent,
        tonalElevation = 0.dp
    ) {  }
}

@Preview
@Composable
fun BottomBarPreview(){
    val navController = rememberNavController()
    BottomBar(navController = navController)
}