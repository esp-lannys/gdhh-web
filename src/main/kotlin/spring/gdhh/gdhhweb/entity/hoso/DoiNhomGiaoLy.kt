package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import javax.persistence.*

@Entity
@Data
@Table(name = "hoso__doi_nhom_giao_ly")
data class DoiNhomGiaoLy (
        @Id
        val id : String,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_chi_doan")
        val chiDoan: ChiDoan,
        val number : Long,
        val hoanTatBangDiemHk1 : Boolean = false,
        val hoanTatBangDiemHk2: Boolean = false,
        val duyetBangDiemHocKy1CDT : Boolean = false,
        val duyetBangDiemHocKy2CDT: Boolean = false,
        @OneToMany(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY, mappedBy = "doiNhomGiaoLy")
        val truongPhuTrachDoi : MutableSet<TruongPhuTrachDoi> = HashSet()
)