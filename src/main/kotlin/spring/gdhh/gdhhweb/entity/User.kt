package spring.gdhh.gdhhweb.entity

import lombok.Data
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Data
@Table(name = "user__user")
data class User (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long,
        val userName : String,
        val userNameCanonical: String,
        val email : String,
        val emailCanonical: String,
        val enabled: Boolean,
        val salt: String,
        val password : String,
        val last_login : LocalDateTime,
        val confirmationToken : String,
        val passwordRequestedAt: LocalDateTime,
        val roles : String
)