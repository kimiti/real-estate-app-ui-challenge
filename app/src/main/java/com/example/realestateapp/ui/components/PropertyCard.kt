package com.example.realestateapp.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.realestateapp.R
import com.example.realestateapp.core.model.Property

@Composable
fun PropertyCard(item: Property) {
    val white = colorResource(R.color.white)
    val blue = colorResource(R.color.blue)
    val black = colorResource(R.color.black)
    val grey = colorResource(R.color.grey)

    Column {  }
}


@Preview
@Composable
fun PropertyCardPreview(){
    val property =  Property(
        type = "Apartment",
        title = "Royal Apartment",
        address = "LosAngles LA",
        pickPath = "pic_1",
        price = 1500,
        bed = 2,
        bath = 3,
        size = 350,
        isGarage = true,
        score = 4.5,
        description = "This 2 bed /1 bath home boasts an enormous, open-living plan..."
    )

    PropertyCard(property)
}