package com.example.artspace

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Artwork(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val artistRes: Int,
    @StringRes val yearRes: Int
)

val artworks = listOf(
    Artwork(R.drawable.selfportrait, R.string.title_1, R.string.artist_1, R.string.year_1),
    Artwork(R.drawable.washingtoncrossing, R.string.title_2, R.string.artist_2, R.string.year_2),
    Artwork(R.drawable.littledancer, R.string.title_3, R.string.artist_3, R.string.year_3),
    Artwork(R.drawable.underthewave, R.string.title_4, R.string.artist_4, R.string.year_4),
    Artwork(R.drawable.madame, R.string.title_5, R.string.artist_5, R.string.year_5)
)