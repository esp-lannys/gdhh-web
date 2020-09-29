package spring.gdhh.gdhhweb.entity.hocba

import lombok.Data
import org.springframework.data.annotation.CreatedDate
import spring.gdhh.gdhhweb.entity.hoso.PhanBo
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Data
@Table(name = "hocba__hien_dien")
data class HienDien (
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     val id : String,
     @Column(name = "target_date", nullable = true)
     val targetDate: Date,
     @Column(name = "created_at", nullable = true)
     val createdAt: LocalDateTime,
     @Column(name = "point", nullable = true)
     val point : Double,
     @Column(name = "ghi_nhan", nullable = true)
     val ghiNhan: String,
     @Column(name = "type", nullable = true)
     val type : String,
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "id_phan_bo_thieu_nhi")
     val thieuNhi: PhanBo,
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "id_phan_bo_truong")
     val huynhTruong: PhanBo
)