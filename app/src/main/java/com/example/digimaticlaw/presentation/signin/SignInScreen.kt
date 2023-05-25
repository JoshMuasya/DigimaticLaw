package com.example.digimaticlaw.presentation.signin

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.digimaticlaw.R
import com.example.digimaticlaw.ui.theme.DigimaticLawTheme

@Composable
fun SignInScreen(
    state: SignInState,
    onSignInClick: () -> Unit
) {
    val context = LocalContext.current

    LaunchedEffect(
        key1 = state.signInError
    ) {
        state.signInError?.let {error ->
            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier,
            horizontalAlignment = CenterHorizontally,
        ) {
            Text(
                text = "DIGIMATIC",
                color = MaterialTheme.colorScheme.tertiary,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                fontFamily = FontFamily(
                    Font(R.font.chococooky)
                ),
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = "LAW MANAGEMENT SYSTEM",
                color = MaterialTheme.colorScheme.tertiary,
                fontSize = 24.sp,
                fontFamily = FontFamily(
                    Font(R.font.quicksand_bold)
                ),
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Text(
                text = "APP",
                color = MaterialTheme.colorScheme.tertiary,
                fontWeight = FontWeight.Bold,
                fontSize = 32.sp,
                fontFamily = FontFamily(
                    Font(R.font.chococooky)
                ),
            )
            Spacer(
                modifier = Modifier
                    .height(15.dp)
            )
            Button(
                modifier = Modifier
                    .height(50.dp)
                    .width(180.dp)
                    .align(alignment = CenterHorizontally),
                onClick = onSignInClick,
                shape = RoundedCornerShape(size = 15.dp),
                colors = ButtonDefaults.buttonColors(
                    MaterialTheme.colorScheme.secondary
                )
            ) {
                Text(
                    text = "Sign in",
                    fontFamily = FontFamily(
                        Font(R.font.quicksand_bold)
                    ),
                    fontSize = 24.sp
                )
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun SignInScreenPreview() {
    DigimaticLawTheme {
        SignInScreen(state = SignInState()) {

        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun SignInScreenDarkPreview() {
    DigimaticLawTheme {
        SignInScreen(state = SignInState()) {

        }
    }
}