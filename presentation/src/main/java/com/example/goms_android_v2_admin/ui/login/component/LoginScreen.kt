package com.example.goms_android_v2_admin.ui.login.component

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun LoginScreen(
    context: Context,
    loginCallback: (code: String) -> Unit
) {
    Box {
        LoginPageBackGround()
    }

}