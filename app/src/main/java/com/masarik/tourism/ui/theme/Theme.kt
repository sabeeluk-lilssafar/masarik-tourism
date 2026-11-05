package com.masarik.tourism.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = NavyPrimary,
    onPrimary = SurfaceWhite,
    primaryContainer = TealSoft,
    onPrimaryContainer = NavyDark,
    secondary = GoldPrimary,
    onSecondary = NavyDark,
    secondaryContainer = GoldSoft,
    onSecondaryContainer = GoldDark,
    tertiary = TealPrimary,
    onTertiary = SurfaceWhite,
    background = BackgroundSlate,
    onBackground = TextDark,
    surface = SurfaceWhite,
    onSurface = TextDark,
    surfaceVariant = CreamParchment,
    onSurfaceVariant = TextMedium,
    outline = CardBorder
)

private val DarkColorScheme = darkColorScheme(
    primary = TealLight,
    onPrimary = NavyDark,
    secondary = GoldLight,
    onSecondary = NavyDark,
    background = NavyDark,
    onBackground = SurfaceWhite,
    surface = NavyPrimary,
    onSurface = SurfaceWhite
)

@Composable
fun MasarikTourismTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    // Keep bright, light theme based on official badge and parchment colors
    MaterialTheme(
        colorScheme = LightColorScheme,
        content = content
    )
}
