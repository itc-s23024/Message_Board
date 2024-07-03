package jp.ac.it_college.std.s23024.message_board.infrastrucuure.database.repository

import jp.ac.it_college.std.s23024.message_board.domain.repository.UserRepository
import jp.ac.it_college.std.s23024.message_board.infrastrucuure.database.dao.UsersEntity
import org.apache.catalina.User
import org.jetbrains.exposed.sql.transactions.transaction

abstract class UserRepositoryImpl : UserRepository {

    override fun save(user: User) {
        transaction {
            UsersEntity.new {
                viewName = user.viewName
                email = user.email
                password = user.password
            }
        }
    }
}