package com.example.taskmanager.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.sharp.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Tasks()
{
        Column(
            modifier=Modifier.fillMaxWidth(),

            ){
            Surface(
                modifier=Modifier.fillMaxWidth(),
                color= Color.White,
                elevation=4.dp,
            ) {
                Row(
                    modifier=Modifier.fillMaxWidth()
                )
                {
                    TextField(
                        value = "Search",
                        onValueChange ={},
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Text,
                            imeAction = ImeAction.Done
                        )
                    )
//                Spacer(modifier = Modifier.fillMaxWidth())
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription ="Search notes icon",
                        modifier = Modifier
                            .height(30.dp)
                            .width(28.dp)

                    )
                    Button(onClick = {}) {
                        Text(text = "➕")
                    }
                }
            }
//        Scaffold {
//            Button(onClick = {}) {
//                Text(text = "Add notes")
//            }
//        }
            Column()
            {
                Text(text="Created Tasks", fontSize = 30.sp, fontWeight = FontWeight.Bold)
                Row(
                    modifier=Modifier.background(Color.LightGray)
                ) {
                    Text(text = "App Building for Jetpack compose\n\n Deadline:3 months", fontSize = 20.sp, maxLines = 5)
                    Spacer(modifier=Modifier.width(15.dp))
                }
                Spacer(modifier=Modifier.height(15.dp))
                Row(
                    modifier=Modifier.background(Color.LightGray)
                ) {
                    Text(text = "Game engine development\n\n Deadline: 5️ days", fontSize = 20.sp, maxLines = 5)
                }
                Row(
                    modifier=Modifier.background(Color.Transparent)
                ){
                    Button(onClick = {}) {
                        Text(text = "Delete Task")

                    }
                }
            }
            Scaffold(
                floatingActionButton = {
                    ExtendedFloatingActionButton(
                        text = {
                            Text(
                                text = "New Note",
                                style = TextStyle.Default,
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .wrapContentHeight(Alignment.CenterVertically)
                                    .padding(bottom = 2.dp)
                            )
                        },
                        onClick = {  },
                        icon = {
                            Icon(
                                imageVector = Icons.Sharp.Add,
                                contentDescription = "Add Icon"
                            )
                        },
                        backgroundColor = Color.Blue
                    )
                }
            ){

            }
        }

}
//@Preview(showBackground = true)
@Composable
fun TasksPreview()
{

}