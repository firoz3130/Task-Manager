package com.example.taskmanager.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen()
{

    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Text(text="Tasks To Be Done Now", fontSize = 30.sp,
                color=Color.Blue,
                fontWeight = FontWeight.Bold)
Row()
{
    Text(
        text = "Compose App Building",
        modifier = Modifier.padding(16.dp),
        style = MaterialTheme.typography.h6
    )
    Spacer(modifier = Modifier.width(8.dp))
    Text(
        text = "Deadline: 1 day",
        fontWeight= FontWeight.Bold,
        color = Color.Red,
        modifier = Modifier.padding(16.dp),
        style = MaterialTheme.typography.h6
    )
}
            Row()
            {
                Text(
                    text = "Finishing Assignment",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Deadline: 3 days",
                    fontWeight= FontWeight.Bold,
                    color = Color.Red,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            Row()
            {
                Text(
                    text = "Renewing Insurance",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Deadline: 4 days",
                    fontWeight= FontWeight.Bold,
                    color = Color.Blue,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
            Row()
            {
                Text(
                    text = "Electricity Bill",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = " \t Deadline: 18 days",
                    fontWeight= FontWeight.Bold,
                    color = Color.Green,
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.h6
                )
            }
        }
    }
}
//@Preview(showBackground = true)
@Composable
fun MainScreenPreview()
{

}
