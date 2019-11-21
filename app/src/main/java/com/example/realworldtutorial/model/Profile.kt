package com.example.realworldtutorial.model

class Profile(
    val username: String,
    val bio: String,
    val image: String = "",
    val following: Boolean
)

//"profile": {
//    "username": "jake",
//    "bio": "I work at statefarm",
//    "image": "https://static.productionready.io/images/smiley-cyrus.jpg",
//    "following": false
//}