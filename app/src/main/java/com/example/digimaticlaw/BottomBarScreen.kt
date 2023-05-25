package com.example.digimaticlaw

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val title: String,
    val route: String,
    val icon: ImageVector
) {
    object Home : BottomBarScreen(
        "Home",
        "HOME",
        Icons.Rounded.Home
    )

    object Calendar : BottomBarScreen(
        "Calendar",
        "CALENDAR",
        Icons.Rounded.DateRange
    )

    object Register : BottomBarScreen(
        "Register",
        "REGISTER",
        Icons.Rounded.Person
    )
}
