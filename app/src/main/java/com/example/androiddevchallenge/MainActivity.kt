/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.Puppy
import com.example.androiddevchallenge.ui.theme.MyTheme

class MainActivity : AppCompatActivity() {
    private val puppyList = mutableListOf<Puppy>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        addPuppy()

        setContent {
            MyTheme {
                Surface(color = MaterialTheme.colors.background) {
                    PuppyList(puppyList)
                }

            }
        }
    }

    private fun addPuppy() {
        puppyList.add(
            Puppy(
                R.drawable.puppy_white,
                "Ruby",
                "Dog",
                "Very cute and white puppy with silky hair"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_two,
                "Sandy",
                "Dog",
                "One day, this Siberian Husky could pull a sled across Alaska"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_three,
                "Tommy",
                "Dog",
                "A devoted companion and incredible working dog, a Golden Retriever is loved by all"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_two,
                "Dora",
                "Dog",
                "Poodles, like this pup, can be a variety of solid colors, including blues, grays, silvers, browns, apricots and creams"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_white,
                "Lovely",
                "Dog",
                "One of the cutest things about the Wire haired Pointing Griffon? His abundant mustache and eyebrows, for sure"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_three,
                "Charlie",
                "Dog",
                "With a face like this and the personality to match, it's no wonder the Lab has been the most popular breed for 26 years"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_two,
                "Alex",
                "Dog",
                "If you ever wondered what was cuter than one Pug pup, you have your answer. (It's two Pug pups!)"
            )
        )
        puppyList.add(
            Puppy(
                R.drawable.puppy_three,
                "Bailey",
                "Dog",
                "These unbelievably adorable bat-like ears are characteristic of the French Bulldog"
            )
        )

    }
}

// Start building your app here!

@Composable
fun PuppyList(puppyList: List<Puppy>, modifier: Modifier = Modifier) {

    Column() {
        LazyColumn(
            modifier
                .fillMaxSize()
                .padding(10.dp, 0.dp)
        ) {

            items(puppyList) { ItemPuppy ->
                PuppyRow(ItemPuppy)
            }
        }
    }
}

@Composable
fun PuppyRow(puppy: Puppy) {
    Column {
        Spacer(Modifier.height(6.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .padding(PaddingValues(0.dp, 6.dp))
        ) {
            Image(
                painter = painterResource(puppy.image),
                contentDescription = null,
                modifier = Modifier
                    .height(60.dp)
                    .width(60.dp)
                    .clip(shape = RoundedCornerShape(30.dp)),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .padding(PaddingValues(15.dp, 0.dp, 10.dp, 0.dp))
                    .fillMaxWidth()
            ) {
                Text(puppy.name, fontSize = 18.sp, color = Color.Black)
                Text(puppy.type, fontSize = 13.sp, color = Color.DarkGray)
                Text(
                    puppy.desc,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }

        Spacer(Modifier.height(4.dp))

        Box(
            Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.LightGray)
        )
    }

}


@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    val puppyList = mutableListOf<Puppy>()
    for (i in 0 until 10) {
        puppyList.add(Puppy(R.drawable.puppy_white, "Tommy", "Dog", "Good barking dog"))
    }
    MyTheme {
        PuppyList(puppyList)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    val puppyList = mutableListOf<Puppy>()
    for (i in 0 until 10) {
        puppyList.add(Puppy(R.drawable.puppy_white, "Tommy", "Dog", "Good barking dog"))
    }
    MyTheme(darkTheme = true) {
        PuppyList(puppyList)
    }
}