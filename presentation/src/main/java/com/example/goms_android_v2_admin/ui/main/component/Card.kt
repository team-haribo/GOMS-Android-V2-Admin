package com.example.goms_android_v2_admin.ui.main.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.goms_android_v2_admin.ui.theme.GOMSTypography
import com.example.goms_android_v2_admin.ui.theme.IcBackArrow
import com.example.goms_android_v2_admin.ui.theme.n1

@Composable
fun GOMSCard(
    modifier: Modifier = Modifier,
    content: @Composable ColumnScope.() -> Unit
) {
    Card(
        modifier = modifier
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(10.dp),
                ambientColor = Color(0xFF7C7C7C),
                spotColor = Color(0xFF7C7C7C)
            ),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(10.dp),
        content = content,
    )
}

@Preview
@Composable
fun GOMSCardPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        GOMSCard {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "testtesttesttesttest"
            )
        }
    }
}

@Composable
fun NavigateCard(
    modifier: Modifier = Modifier,
    title: String,
    content: String = "",
    content2: AnnotatedString = buildAnnotatedString { append("") }
) {
    GOMSCard {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 16.dp,
                    vertical = 14.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = title,
                    style = GOMSTypography.body3,
                    color = n1
                )
                if (content.isNotBlank())
                    Text(
                      text = content,
                      style = GOMSTypography.body1,
                    )
                else
                    Text(
                        text = content2,
                        style = GOMSTypography.body1,
                    )

            }
            IcBackArrow()
        }
    }
}