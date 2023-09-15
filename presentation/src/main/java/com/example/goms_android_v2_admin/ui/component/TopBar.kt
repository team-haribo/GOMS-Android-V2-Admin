package com.example.goms_android_v2_admin.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.goms_android_v2_admin.ui.theme.IcGomsText
import com.example.goms_android_v2_admin.ui.theme.IcUserProfile
import com.example.goms_android_v2_admin.ui.theme.Primary

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IcGomsText()
        IcUserProfile(tint = Primary)
    }
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar()
}