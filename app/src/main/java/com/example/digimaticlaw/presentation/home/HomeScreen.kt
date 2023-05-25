package com.example.digimaticlaw.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.digimaticlaw.presentation.signin.UserData

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    userData: UserData?,
    onSignOut: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(),
                title = ({
                    if (userData?.userName != null) {
                        Text(
                            text = userData.userName,
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                }),
                navigationIcon = {
                    if (userData?.profilePictureUrl != null) {
                        AsyncImage(
                        model = userData.profilePictureUrl,
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    }
                }
//            Add Sign out
            )
        },
        bottomBar = {
            NavigationBar {

            }
        }
    ) {
        Box(
            modifier = Modifier.padding(it)
        ) {
            Text(text = "This is Body Content")
        }
    }
}


//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//    ) {
//        Row(
//            modifier = Modifier
//                .fillMaxWidth(),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Center
//        ) {
//            if(userData?.profilePictureUrl != null) {
//                AsyncImage(
//                    model = userData.profilePictureUrl,
//                    contentDescription = "Profile Picture",
//                    modifier = Modifier
//                        .size(150.dp)
//                        .clip(CircleShape),
//                    contentScale = ContentScale.Crop
//                )
//                Spacer(modifier = Modifier.height(16.dp))
//            }
//
//            if(userData?.userName != null) {
//                Text(
//                    text = userData.userName,
//                    textAlign = TextAlign.Center,
//                    fontSize = 36.sp,
//                    fontWeight = FontWeight.Bold
//                )
//                Spacer(modifier = Modifier.height(16.dp))
//            }
//        }
//    }
//
//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//
//    }
