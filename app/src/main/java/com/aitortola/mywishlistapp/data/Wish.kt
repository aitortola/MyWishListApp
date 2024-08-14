package com.aitortola.mywishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
    val description: String = "",
)

object DummyWish {
    val wishList = listOf(
        Wish(title = "Google Watch 2", description = "Android watch"),
        Wish(title = "Meta Quest 3", description = "VR headsets for gamers"),
        Wish(title = "Sci-fi Book", description = "A science fiction book from any best seller"),
        Wish(title = "Bean bag", description = "A comfy bean bag to substitute for a char"),
    )
}