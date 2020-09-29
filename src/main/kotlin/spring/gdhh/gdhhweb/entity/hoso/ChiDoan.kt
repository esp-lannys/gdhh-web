package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import javax.persistence.*

@Entity
@Data
@Table(name = "hoso__chi_doan")
data class ChiDoan (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : String,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "namHoc")
        val namHoc: NamHoc,
        val name: String,
        val number : Long,
        @Column(columnDefinition = "json")
        val cotDiemBiLoaiBo : String,
        val phanDoan : String,
        val hoanTatBangDiemHk1 : Boolean = false,
        val duocDuyetBandDiemHk1: Boolean = false,
        val hoanTatBangDiemHk2 : Boolean = false,
        val duocDuyetBandDiemHk2: Boolean = false,
        @Column(name = "phieu_cnbo_sung", columnDefinition = "json")
        val phieuCnBoSung: String,
        val tinhDiemThu5: Boolean = true,
        val tinhDiemCn: Boolean = true,
        @Column(name = "chia_deu_diem_cccho_ngay_cn")
        val chiaDeuDiemChuyenCanChoNgayChuNhat : Boolean = false,
        @OneToMany(cascade = [CascadeType.PERSIST, CascadeType.MERGE], fetch = FetchType.LAZY, mappedBy = "chiDoan")
        val doiNhomGiaoLy: MutableSet<DoiNhomGiaoLy> = HashSet()
)