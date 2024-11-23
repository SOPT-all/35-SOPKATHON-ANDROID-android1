package com.sopt.a35_sopkathon_android_android1.jiwon

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun JiwonRoute(
    navigateToMinjae: () -> Unit
) {
    JiwonScreen(
        navigateToMinjae = navigateToMinjae
    )
}

@Composable
fun JiwonScreen(
    navigateToMinjae: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "지원 스크린",
            modifier = Modifier.clickable(onClick = navigateToMinjae)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ShowJiwonScreen() {
    JiwonScreen(
        navigateToMinjae = {}
    )
}