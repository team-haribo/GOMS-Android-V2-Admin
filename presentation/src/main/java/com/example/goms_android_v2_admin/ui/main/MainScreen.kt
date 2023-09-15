package com.example.goms_android_v2_admin.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.goms_android_v2_admin.R
import com.example.goms_android_v2_admin.ui.component.GOMSButton
import com.example.goms_android_v2_admin.ui.component.TopBar
import com.example.goms_android_v2_admin.ui.main.component.GOMSCard
import com.example.goms_android_v2_admin.ui.main.component.NavigateCard
import com.example.goms_android_v2_admin.ui.theme.Background
import com.example.goms_android_v2_admin.ui.theme.GOMSTypography
import com.example.goms_android_v2_admin.ui.theme.IcMain
import com.example.goms_android_v2_admin.ui.theme.Primary
import com.example.goms_android_v2_admin.ui.theme.n1
import com.example.goms_android_v2_admin.ui.theme.n2
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    outingCount: Int,
    profileUrl: String? = null,
    name: String,
    grade: Int,
    classNum: Int,
    number: Int
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Background)
            .padding(horizontal = 26.dp)
    ) {
        TopBar(modifier = Modifier.padding(top = 10.dp))
        Spacer(modifier = Modifier.weight(1f))
        Row(modifier = Modifier.fillMaxWidth()) {
            Column{
                Text(
                    text = "간편하게\n수요외출제를\n관리해 보세요!",
                    style = GOMSTypography.h1
                )
                Spacer(modifier = Modifier.height(22.dp))
                GOMSButton(
                    text = "QR 생성하기",
                    color = Primary,
                    textStyle = GOMSTypography.h3,
                    paddingValues = PaddingValues(
                        horizontal = 33.dp,
                        vertical = 0.dp
                    ) // remove button default vertical padding
                ) {}
            }
            Spacer(modifier = Modifier.weight(1f))
            IcMain(modifier = Modifier.padding(end = 20.dp))
        }
        Spacer(modifier = Modifier.weight(1f))
        NavigateCard(
            title = "현재 183명의 학생 중에서",
            content2 = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(color = Primary)
                ) {
                    append(outingCount.toString())
                }
                append(" 명이 외출중이에요!")
            }
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "지각의 전당",
            style = GOMSTypography.h2,
            color = n2
        )
        Spacer(modifier = Modifier.weight(0.5f))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val studentNum = if (number < 10) "0$number" else number
            repeat(3) {
                GOMSCard {
                    Column(
                        modifier = Modifier.padding(
                            horizontal = 28.dp,
                            vertical = 14.dp
                        ),
                    ) {
                        CoilImage(
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .align(CenterHorizontally),
                            imageModel = { profileUrl ?: R.drawable.ic_user_profile }
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 16.dp)
                                .align(CenterHorizontally),
                            text = name,
                            style = GOMSTypography.body2
                        )
                        Text(
                            modifier = Modifier
                                .padding(top = 8.dp)
                                .align(CenterHorizontally),
                            text = "$grade$classNum$studentNum",
                            style = GOMSTypography.body3,
                            color = n1
                        )
                    }
                }
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        NavigateCard(
            title = "모든 학생들의 역할을 관리해보세요!",
            content = "학생 관리하기"
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen(
        outingCount = 48,
        name = "박성현",
        grade = 3,
        classNum = 2,
        number = 8
    )
}