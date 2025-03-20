package com.example.composebasicspracticeapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
                    MainApp(
                        modifier = Modifier.padding(innerPadding)


                    )
                }
            }
        }
    }
}

@Composable
fun MainApp(modifier: Modifier = Modifier) {
    /* first practice app == pracAppOne
    ComposeTutorialsScreen(
        tutorialTitle = stringResource(R.string.title),
        tutorialIntro = stringResource(R.string.intro),
        tutorialBody = stringResource(R.string.body)
    )

     */

    /* second practice app == pracAppTwo

     */
    DoneTaskScreen()
}

@Composable
fun ComposeTutorialsScreen(
    tutorialTitle: String,
    tutorialIntro: String,
    tutorialBody: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(top = 25.dp),
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.compose_tutorials_img)
        Image(
            painter = image,
            contentDescription = "image",
            modifier = Modifier.fillMaxWidth()
            )
        Text(
            text = tutorialTitle,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = tutorialIntro,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = tutorialBody,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }

}

@Composable
fun DoneTaskScreen(
    modifier: Modifier = Modifier,
    ) {
    val taskDoneImg = painterResource(R.drawable.ic_task_completed_checkmark)
    Column(
        modifier = modifier
            .fillMaxSize()
            .alpha(0.9f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = taskDoneImg,
            contentDescription = "Green Task Completed Checkmark"
        )
        TextComponent(
            text = stringResource(R.string.all_tasks_completed),
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
            textSize = 20.sp,
            textWeight = FontWeight.Bold

        )
        TextComponent(
            text = stringResource(R.string.done_task_message),
            modifier = modifier,
            textSize = 16.sp,
            textWeight = FontWeight.Normal
        )
    }


}

@Composable
fun TextComponent(
    text: String,
    textSize: TextUnit,
    textWeight: FontWeight,
    modifier: Modifier = Modifier
) {
    Text(text = text, modifier = modifier, fontSize = textSize, fontWeight = textWeight)

}

@Preview(showBackground = true)
@Composable
fun MainAppPreview() {
    ComposeBasicsPracticeAppsTheme {
        DoneTaskScreen()
    }
}