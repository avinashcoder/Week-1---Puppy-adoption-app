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
package com.avinashcoder.puppyadoption.data

import com.avinashcoder.puppyadoption.R
import com.avinashcoder.puppyadoption.model.Puppy
import com.avinashcoder.puppyadoption.model.PuppyOwner

object FakePuppyDatabase {
    val owner = PuppyOwner("Google Dev", "Developer & Pet Lover", R.drawable.owner)
    val puppyList = listOf(
        Puppy(
            0,
            "Ruby",
            3.9,
            "Male",
            "Gray",
            12.9,
            "389m away",
            R.drawable.puppy_white,
            "Very cute and white puppy with silky hair. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Puppy(
            1,
            "Sandy",
            2.5,
            "Male",
            "Black",
            12.4,
            "412m away",
            R.drawable.puppy_three,
            "One day, this Siberian Husky could pull a sled across Alaska. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Puppy(
            2,
            "Tommy",
            1.4,
            "Female",
            "White",
            9.6,
            "879m away",
            R.drawable.puppy_two,
            "A devoted companion and incredible working dog, a Golden Retriever is loved by all. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Puppy(
            3,
            "Lovely",
            2.1,
            "Male",
            "Black",
            8.2,
            "672m away",
            R.drawable.puppy_white,
            "One of the cutest things about the Wire haired Pointing Griffon? His abundant mustache and eyebrows, for sure. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        ),
        Puppy(
            4,
            "Charlie",
            2.4,
            "Female",
            "Choco",
            14.9,
            "982m away",
            R.drawable.puppy_three,
            "With a face like this and the personality to match, it's no wonder the Lab has been the most popular breed for 26 years. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
            owner
        )
    )
}
