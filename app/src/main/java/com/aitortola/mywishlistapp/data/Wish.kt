package com.aitortola.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table") // SQLite table called "wish-table"
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name = "wish-title")
    val title: String = "",
    @ColumnInfo(name = "wish-desc")
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