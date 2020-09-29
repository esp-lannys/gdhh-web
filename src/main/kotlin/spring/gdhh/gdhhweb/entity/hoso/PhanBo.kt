package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import spring.gdhh.gdhhweb.entity.hocba.BangDiem
import spring.gdhh.gdhhweb.entity.hocba.HienDien
import java.util.*
import javax.persistence.*
import kotlin.collections.HashSet

@Entity
@Data
@Table(name = "hoso__phan_bo")
data class PhanBo (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: String,
        val createdAt : Date,
        val tienQuyDong : Int = 0,
        val ngheoKho : Boolean = false,
        val dacBiet : Boolean = false,
        val nhanSach : Boolean = false,
        val dongTienSach : Boolean = false,
        val daDongQuy: Boolean = false,
        val duBi : Boolean = false,
        val thieuNhi : Boolean = true,
        val duTruong : Boolean = false,
        val huynhTruong : Boolean = false,
        val chiDoanTruong : Boolean = false,
        val thuKyChiDoan: Boolean = false,
        val phanDoanTruong : Boolean = false,
        val xuDoanTruong : Boolean = false,
        val xuDoanPhoNoi : Boolean = false,
        val xuDoanPhoNgoai : Boolean = false,
        val thukyXuDoan : Boolean = false,
        val thuQuyXuDoan : Boolean = false,
        val soeur : Boolean = false,
        val phanDoan : String,
        @OneToOne
        @JoinColumn(name = "id_phan_bo_truoc")
        val phanBoTruoc: PhanBo?,
        @OneToOne(fetch = FetchType.LAZY)
        val bangDiem: BangDiem,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_doi_nhom_giao_ly")
        val doiNhomGiaoLy: DoiNhomGiaoLy,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_chi_doan")
        val chiDoan: ChiDoan,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_nam_hoc")
        val namHoc: NamHoc,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_thanh_vien")
        val thanhVien: ThanhVien,
        @OneToMany(cascade = [CascadeType.MERGE, CascadeType.PERSIST],fetch = FetchType.LAZY, mappedBy = "phanBo")
        val truongPhuTrachDoi: MutableSet<TruongPhuTrachDoi> = HashSet(),
        @OneToMany(cascade = [CascadeType.MERGE, CascadeType.PERSIST],fetch = FetchType.LAZY, mappedBy = "thieuNhi")
        val hienDienThieuNhi: MutableSet<HienDien> = HashSet(),
        @OneToMany(cascade = [CascadeType.MERGE, CascadeType.PERSIST],fetch = FetchType.LAZY, mappedBy = "huynhTruong")
        val hienDienTruong: MutableSet<HienDien> = HashSet()
)