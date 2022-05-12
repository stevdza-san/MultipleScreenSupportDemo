package com.example.multiplescreensupportdemo.screen.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private var _items = mutableStateListOf<CustomData>()
    val items: List<CustomData> = _items

    init {
        getData()
    }

    private fun getData() {
        for (number in 0 until 10) {
            _items.add(
                element = CustomData(
                    id = number,
                    image = "https://picsum.photos/id/$number/300/300",
                    title = "#$number Lorem Ipsum",
                    description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.",
                    icons = listOf(
                        Icons.Default.Check,
                        Icons.Default.Edit,
                        Icons.Default.Face,
                        Icons.Default.Email,
                        Icons.Default.List,
                        Icons.Default.Home
                    )
                )
            )
        }
    }

}

data class CustomData(
    val id: Int,
    val image: String,
    val title: String,
    val description: String,
    val icons: List<ImageVector>
)