package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import javax.persistence.*

@Entity
@Data
@Table(name = "hoso__nam_hoc")
data class NamHoc (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long,
        val started : Boolean,
        val enabled : Boolean,
        val diemTb: Double = 5.0,
        val diemKha: Double = 7.5,
        val diemGioi: Double = 8.75,
        val phieuLenLop : Int = 15,
        val phieuKhenThuong : Int = 25,
        val tienQuy: Int = 120000,
        val namTruoc : Int,
        @OneToMany(cascade = [CascadeType.MERGE, CascadeType.PERSIST], fetch = FetchType.LAZY, mappedBy = "namHoc")
        val phanBo: MutableSet<PhanBo> = HashSet(),
        @OneToMany(cascade = [CascadeType.MERGE, CascadeType.PERSIST], fetch = FetchType.LAZY, mappedBy = "namHoc")
        val chiDoan: MutableSet<ChiDoan> = HashSet()
)