package com.example.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnTogetherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    ArticleText(
                        head = getString(R.string.header),
                        bod1 = getString(R.string.body1),
                        bod2 = getString(R.string.body2),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleText(head: String, bod1: String, bod2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column(
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = head,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = bod1,
            textAlign = TextAlign.Justify,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = bod2,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        ArticleText(
            head = stringResource(R.string.header),
            bod1 = stringResource(R.string.body1),
            bod2 = stringResource(R.string.body2)
        )
    }
}