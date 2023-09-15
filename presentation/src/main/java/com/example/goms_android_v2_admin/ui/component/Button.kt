package com.example.goms_android_v2_admin.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.goms_android_v2_admin.ui.theme.GOMSTypography
import com.example.goms_android_v2_admin.ui.theme.Primary

@Composable
fun GOMSButton(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    paddingValues: PaddingValues = PaddingValues(0.dp),
    textStyle: TextStyle,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = color,
            contentColor = White
        ),
        shape = RoundedCornerShape(8.dp),
        onClick = onClick,
        contentPadding = paddingValues
    ) {
        Text(
            text = text,
            style = textStyle,
        )
    }
}

@Preview
@Composable
fun GOMSButtonPreview() {
    GOMSButton(
        text = "QR 생성하기",
        color = Primary,
        textStyle = GOMSTypography.h3,
        paddingValues = PaddingValues(horizontal = 0.dp, vertical = 0.dp) // remove button default vertical padding
    ) {}
}