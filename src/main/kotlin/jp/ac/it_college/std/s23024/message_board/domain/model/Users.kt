package jp.ac.it_college.std.s23024.message_board.domain.model

data class Users(
    val id : Long,
    val viewName: String,
    val email: String,
    var password: String,
)
