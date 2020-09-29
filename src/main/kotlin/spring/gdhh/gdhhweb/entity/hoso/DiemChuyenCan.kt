package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.*

@Entity
@Data
@Table(name = "hoso__diem_chuyen_can")
data class DiemChuyenCan (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long,
        val targetDate : Date,
        val massCounted: Boolean,
        val studyCounted: Boolean
)