package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Data
@Table(name = "hoso__christian_name")
data class ChristianName (
        @Id
        val id : String,
        val position : Int,
        val sex: String,
        val tiengViet: String,
        val tiengAnh: String,
        val code: String
)