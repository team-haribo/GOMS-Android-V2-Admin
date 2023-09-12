package com.example.goms_android_v2_admin.ui.theme

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.goms_android_v2_admin.R

@Composable
fun IcMain(
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = R.drawable.ic_main),
        contentDescription = "IcMain",
        tint = tint
    )
}

@Composable
fun IcUserProfile(
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = R.drawable.ic_user_profile),
        contentDescription = "IcMainProfile",
        tint = tint
    )
}

@Composable
fun IcGomsText(
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = R.drawable.ic_goms_text),
        contentDescription = "IcGomsText",
        tint = tint
    )
}

@Composable
fun IcBackArrow(
    modifier: Modifier = Modifier,
    tint: Color = Color.Unspecified
) {
    Icon(
        modifier = modifier,
        painter = painterResource(id = R.drawable.ic_back_arrow),
        contentDescription = "IcBackArrow",
        tint = tint
    )
}