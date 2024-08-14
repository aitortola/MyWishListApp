package com.aitortola.mywishlistapp

sealed class Screen(
    val route: String,
) {
    object HomeScreen: Screen("homeScreen")
    object AddWishScreen: Screen("addWishScreen")
}