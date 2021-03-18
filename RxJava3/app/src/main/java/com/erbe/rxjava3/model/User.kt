package com.erbe.rxjava3.model

data class User(
    var id: Long = 0L,
    var firstname: String,
    var lastname: String,
    var isFollowing: Boolean = false
)