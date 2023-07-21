package com.plcoding.composepaging3caching.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.composepaging3caching.domain.Beer
import com.plcoding.composepaging3caching.ui.theme.ComposePaging3CachingTheme

@Composable
fun BeerItem(
    beer: Beer,
    modifier: Modifier = Modifier
) {

}

@Preview
@Composable
fun BeerItemPreview() {
    ComposePaging3CachingTheme {
        BeerItem(beer = Beer(
            id = 1,
            name = "Beer",
            tagline = "This is a cool beer",
            firstBrewed = "07/2023",
            description = "This is a description for a beer. \nThis is the next line ",
            imageUrl = null
        ))
    }
}