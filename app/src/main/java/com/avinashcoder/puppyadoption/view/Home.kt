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
package com.avinashcoder.puppyadoption.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.avinashcoder.puppyadoption.component.ItemPuppyCard
import com.avinashcoder.puppyadoption.component.TopBar
import com.avinashcoder.puppyadoption.model.Puppy

@Composable
fun Home(navController: NavHostController, puppyList: List<Puppy>, toggleTheme: () -> Unit) {
    LazyColumn {
        item {
            TopBar(
                onToggle = {
                    toggleTheme()
                }
            )
            Spacer(modifier = Modifier.height(2.dp))
        }
        /*items(puppyList) { ItemPuppy ->
            PuppyRow(ItemPuppy)
        }*/
        items(puppyList) { ItemPuppy ->
                ItemPuppyCard(
                    ItemPuppy,
                    onItemClicked = { dog ->
                        navController.navigate("details/${dog.id}//${dog.name}/${dog.location}")
                    }
                )
        }
    }
}
