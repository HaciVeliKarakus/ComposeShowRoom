package io.hvk.compose.demo.screen.draw

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import composeshowroom.composeapp.generated.resources.Res
import composeshowroom.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

object DrawScreen : Screen {

    @Composable
    override fun Content() {
        Magnifier {
            Image(
                painterResource(Res.drawable.compose_multiplatform),
                contentDescription = "kmp",
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}