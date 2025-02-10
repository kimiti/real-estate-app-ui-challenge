package com.example.realestateapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestateapp.R

@Composable
fun CategoryItem(
    icon: Int,
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(45.dp)
                .clip(RoundedCornerShape(30.dp))
                .background(colorResource(R.color.white)),
            contentAlignment = Alignment.Center
        ) { }
    }
}

@Preview
@Composable
fun CategoryItemPreview(){
    CategoryItem(
        icon =R.drawable.ic_launcher_background,
        title = "Sample Category"
    )
}