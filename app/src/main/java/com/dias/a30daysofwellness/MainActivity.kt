package com.dias.a30daysofwellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dias.a30daysofwellness.ui.WellnessDataSource
import com.dias.a30daysofwellness.ui.model.Wellness
import com.dias.a30daysofwellness.ui.theme.A30DaysOfWellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A30DaysOfWellnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    WellnessApp(WellnessDataSource.wellnesses)
                }
            }
        }
    }
}

@Composable
fun WellnessApp(wellnessList: List<Wellness>) {
    Scaffold {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(wellnessList) { wellness ->
                WellnessCard(wellness)
            }
        }
    }
}


@Composable
fun WellnessCard(wellness: Wellness) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            val painter = painterResource(wellness.imageRes)
            val imageRatio = painter.intrinsicSize.width / painter.intrinsicSize.height
            Text(
                text = stringResource(R.string.day, wellness.day),
            )
            Text(
                text = stringResource(wellness.summary),
            )
            Image(
                painter = painter,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().aspectRatio(imageRatio),
                contentScale = ContentScale.Fit
            )
            Text(
                text = stringResource(wellness.description)
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun WellnessCardPreview() {
    A30DaysOfWellnessTheme {
        WellnessCard(Wellness(1, R.string.summary_1, R.drawable.ai, R.string.description_1))
    }
}