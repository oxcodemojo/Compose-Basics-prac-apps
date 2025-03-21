package com.example.composebasicspracticeapps

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasicspracticeapps.ui.theme.ComposeBasicsPracticeAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeBasicsPracticeAppsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ebby",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp(modifier: Modifier = Modifier) {

}

@Composable
fun BusinessCardInfoSections(
    modifier: Modifier = Modifier
) {

}

@Composable
fun TextComponent(
    text: String,
    fontColor: Color,
    fontSize: TextUnit,
    modifier: Modifier = Modifier
) {
    Text(text = text, fontSize = fontSize, color = fontColor)

}

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(top = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val androidLogo = painterResource(R.drawable.android_logo)
        Image(
            painter = androidLogo,
            contentScale = ContentScale.Fit,
            contentDescription = "Green Android Logo with text \"android\"",
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .width(70.dp)
                .height(70.dp)
                .background(colorResource(R.color.black))
        )
        TextComponent(
            "Code Mojo",
            Color(0xFF000000),
            35.sp,
        )
        TextComponent(
            "Android Developer at Google.",
            Color(0xFF000000),
            15.sp
        )
    }

}

@Composable
fun ContactInfoSection(
    modifier: Modifier = Modifier
) {
    val contactIcons = Icons.Rounded

    Column {
        ContactInfoCard(
            icon = Icons.Rounded.Call,
            text = "+22 (00) 000 000"

        )
        ContactInfoCard(
            icon = Icons.Rounded.Share,
            text = "@x.com"

        )
        ContactInfoCard(
            icon = Icons.Rounded.Email,
            text = "techmojo@gmail.com"

        )

    }
    
}

@Composable
fun ContactInfoCard(
    icon: ImageVector,
    text: String,
    modifier: Modifier = Modifier
) {
    val contactIcons = Icons.Rounded
    Row {

        Text(text = text)


    }
    
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun BusinessCardAppPreview() {
    ComposeBasicsPracticeAppsTheme {
        ContactInfoSection(modifier = Modifier.fillMaxSize())

    }
}