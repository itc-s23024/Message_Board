package jp.ac.it_college.std.s23024.message_board.domain.repository

import org.apache.catalina.User


interface UserRepository {
    fun save(user: User)
}