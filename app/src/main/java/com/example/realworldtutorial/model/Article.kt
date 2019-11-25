package com.example.realworldtutorial.model

data class Article(
    val slug: String,
    val title: String,
    val description: String,
    val body: String,
    val tagList: String,
    val createdAt: String,
    val updatedAt: String,
    val favorited: Boolean,
    val favoritesCount: Int,
    val author: Author
) {

}

//{
//    "article": {
//    "slug": "how-to-train-your-dragon",
//    "title": "How to train your dragon",
//    "description": "Ever wonder how?",
//    "body": "It takes a Jacobian",
//    "tagList": ["dragons", "training"],
//    "createdAt": "2016-02-18T03:22:56.637Z",
//    "updatedAt": "2016-02-18T03:48:35.824Z",
//    "favorited": false,
//    "favoritesCount": 0,
//    "author": {
//    "username": "jake",
//    "bio": "I work at statefarm",
//    "image": "https://i.stack.imgur.com/xHWG8.jpg",
//    "following": false
//}
//}
//}