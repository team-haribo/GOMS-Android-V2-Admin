package com.example.goms_android_v2_admin.ui.theme

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.goms_android_v2_admin.R

val sfProFont = FontFamily(
    Font(R.font.sf_pro_text_bold, FontWeight.Bold),
    Font(R.font.sf_pro_text_light, FontWeight.Light),
    Font(R.font.sf_pro_text_medium, FontWeight.Medium),
    Font(R.font.sf_pro_text_regular, FontWeight.Normal),
    Font(R.font.sf_pro_text_thin, FontWeight.Thin),
    Font(R.font.sf_pro_text_semibold, FontWeight.SemiBold)
)

object GOMSTypography {
    @Stable
    val h1 = TextStyle(
        fontFamily = sfProFont,
        fontSize = 24.sp,
        fontWeight = FontWeight.SemiBold
    )

    @Stable
    val h2 = TextStyle(
        fontFamily = sfProFont,
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold
    )

    @Stable
    val h3 = TextStyle(
        fontFamily = sfProFont,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold
    )

    @Stable
    val body1 = TextStyle(
        fontFamily = sfProFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val body2 = TextStyle(
        fontFamily = sfProFont,
        fontSize = 16.sp,
        fontWeight = FontWeight.Medium
    )

    @Stable
    val body3 = TextStyle(
        fontFamily = sfProFont,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal
    )
}