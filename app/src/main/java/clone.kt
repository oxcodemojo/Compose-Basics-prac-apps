import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasicspracticeapps.R
import com.example.composebasicspracticeapps.ui.theme.ComposeBasicsPracticeAppsTheme

@Composable
fun PostPageClone(modifier: Modifier = Modifier) {
    // ---------------- TODO AND SCREEN STRUCTURE ----------------
    // top section profile pics, profile name and more/close icons
    // post text section
    // image/video multimedia section
    // reactions and reaction count section - row containing likes, comment, shares and views(if video)
    // reaction buttons section - image/text pair - like, comment, send, share
    // user comment section - user image, name and comment text + reaction buttons
    // account owner comment section - profile picture and comment text-field

}

@Composable
fun PostPage(
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .background(Color.White),

    ) {
        Row(modifier = Modifier.padding(20.dp)) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .height(70.dp)
                    .width(75.dp)
                    .clip(CircleShape)
                    .background(Color.Black),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier
                .padding(start = 8.dp, top = 10.dp)
                .weight(1f)) {
                Text(text = "Lebron James", fontWeight = FontWeight.Bold, fontSize = 25.sp)
                Row {
                    Text(text = "37m   ")
                    Icon(
                        imageVector = Icons.Filled.Notifications,
                        contentDescription = "Notification",
                        tint = Color.Gray,
                    )
                }
            }
            Row(modifier = Modifier.padding(top = 10.dp)) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Favorite",
                    tint = Color.Gray,
                    modifier = Modifier.rotate(90f).size(40.dp)
                )
                Icon(
                    imageVector = Icons.Filled.Close,
                    contentDescription = "Close",
                    tint = Color.Gray,
                    modifier = Modifier.size(40.dp)
                )
            }


        }
        Text(
            text = stringResource(R.string.dummy_post),
            modifier = Modifier.padding(top = 12.dp, start = 20.dp, end = 20.dp, bottom = 10.dp),
            fontSize = 16.sp,
        )
        Image(
            painter = painterResource(R.drawable.lebron),
            contentDescription = "Post Multimedia (Image/Video)",
            modifier = Modifier.fillMaxWidth()
        )




        Row(
            modifier = Modifier,

        ) {
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .weight(2f)
            ) {
                Icon(
                    imageVector = Icons.Filled.ThumbUp,
                    contentDescription = "thumbup",
                    tint = Color.Blue
                )
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "favorite",
                    tint = Color.Red
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = "636")
            }

            iconTextList.forEach {
                Row(
                    modifier = Modifier.padding(top = 10.dp)
                        .weight(1f)
                ) {
                    Text(text = it.icon, fontSize = 12.sp, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(text = it.text, fontSize = 10.sp, fontWeight = FontWeight.Bold)
                }
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

            ) {
            Row {
                Icon(
                    imageVector = Icons.Filled.ThumbUp,
                    contentDescription = "favorite",
                    tint = Color.Gray
                )

                Text(text = "  Like")


            }
            Row {
                Icon(
                    imageVector = Icons.Filled.Comment,
                    contentDescription = "favorite",
                    tint = Color.Gray
                )
                Text(text = "  Comment")


            }
            Row {
                Icon(
                    imageVector = Icons.Filled.Whatsapp,
                    contentDescription = "favorite",
                    tint = Color.Gray
                )
                Text(text = "  WhatsApp")


            }
            Row {
                Icon(
                    imageVector = Icons.Filled.Share,
                    contentDescription = "favorite",
                    tint = Color.Gray
                )
                Text(text = " Share")


            }

        }

    }



}
class IconsAndText(val icon: String, val text: String)
val iconTextList = listOf(
    IconsAndText("158", "comments"),
    IconsAndText("142", "shares"),
    IconsAndText("7.3k", "views"),
)

class ReactionIcons(val reactionIcon: ImageVector, val reactionIconText: String)


@Composable
fun ReactionSection(
    modifier: Modifier = Modifier
) {
    Row {
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "favorite",
            tint = Color.Red
        )
        Text(text = "Like")


    }



    
}


@Preview(showBackground = true)
@Composable
fun PostPageClonePreview() {
    ComposeBasicsPracticeAppsTheme {
        PostPage()

    }

}