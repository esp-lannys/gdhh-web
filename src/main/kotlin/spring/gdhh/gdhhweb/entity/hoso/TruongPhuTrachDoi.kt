package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import javax.persistence.*

@Entity
@Data
@Table(name = "hoso__truong_phu_trach_doi")
data class TruongPhuTrachDoi(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : String,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_doi_nhom_giao_ly")
        val doiNhomGiaoLy: DoiNhomGiaoLy,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_phan_bo_hang_nam")
        val phanBo: PhanBo
)