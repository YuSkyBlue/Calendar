package com.bluesky.presentation.view.tab.setting

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.bluesky.presentation.theme.CalendarTheme
import com.bluesky.presentation.theme.surfaceDim

@Composable
internal fun SettingScreen(modifier: Modifier) {
    Column(
        modifier = modifier
    ) {

    }
}


@Composable
@Preview(showBackground = true, widthDp = 400, heightDp = 800)
fun SettingScreenPreview() {
    CalendarTheme {
        SettingScreen(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceDim))
    }
}