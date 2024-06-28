package jp.ac.it_college.std.s23024.message_board.infrastrucuure.database.dao

import org.jetbrains.exposed.dao.id.LongIdTable

object UsersTable : LongIdTable("users") {
    val view_name = varchar("view_name", 32).nullable()
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128).nullable()
}