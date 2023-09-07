package com.example.goms_android_v2_admin.ui.login.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.msg.gauthsignin.component.GAuthButton
import com.msg.gauthsignin.component.utils.Types

@Composable
fun LoginButton(onClick: () -> Unit){
    GAuthButton(style = Types.Style.ROUNDED,
        actionType = Types.ActionType.SIGNIN,
        colors = Types.Colors.WHITE,
        horizontalPaddingValue = 14.dp
    ) {

    }
}