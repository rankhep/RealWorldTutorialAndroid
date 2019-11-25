package com.example.realworldtutorial.model

class Comment(
    val id: Int,
    val createdAt: String,
    val updatedAt: String,
    val body: String,
    val author: Author
)

//) {
//    "comment":
//    {
//        "id": 1,
//        "createdAt": "2016-02-18T03:22:56.637Z",
//        "updatedAt": "2016-02-18T03:22:56.637Z",
//        "body": "It takes a Jacobian",
//        "author": {
//        "username": "jake",
//        "bio": "I work at statefarm",
//        "image": "https://i.stack.imgur.com/xHWG8.jpg",
//        "following": false
//    }
//    }
//}