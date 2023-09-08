package com.example.goms_android_v2_admin.ui.login.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.goms_android_v2_admin.R

@Preview
@Composable
fun LoginPageBackGround() {
    Column(modifier = Modifier.padding(all = 12.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_goms_bear),
            contentDescription = "login page background logo",
            )

        Text(text = "GOMS",
            style = TextStyle(
                fontSize = 26.sp,
                lineHeight = 30.11.sp,
                fontFamily = FontFamily(Font(R.font.fraunces)),
                fontWeight = FontWeight(900),
            )
        )
    }
}