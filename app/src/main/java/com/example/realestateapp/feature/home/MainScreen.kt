package com.example.realestateapp.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestateapp.R
import com.example.realestateapp.ui.components.CategoriesRow
import com.example.realestateapp.ui.components.HeaderSection
import com.example.realestateapp.ui.components.PropertyCard
import com.example.realestateapp.ui.components.SearchRow

@Preview
@Composable
fun MainScreen() {
    val items = remember { sampleProperties() }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(colorResource(R.color.lightGrey)),
        contentPadding = PaddingValues(bottom = 100.dp)
    ) {
        item { HeaderSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { SearchRow() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { CategoriesRow() }
        items(items){property ->
            PropertyCard(property)
        }
        item { Spacer(modifier = Modifier.height(16.dp)) }
    }
}