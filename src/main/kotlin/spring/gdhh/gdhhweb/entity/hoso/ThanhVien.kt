package spring.gdhh.gdhhweb.entity.hoso

import lombok.Data
import spring.gdhh.gdhhweb.entity.User
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Data
@Table(name = "hoso__thanh_vien")
data class ThanhVien (
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : Long,
        @OneToOne(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY)
        val user : User,
        val code : String,
        val sex : String,
        val dob : LocalDateTime,
        val namHoc : Long,
        val chiDoan : Long,
        val enabled : Boolean = false,
        val approved : Boolean = false,
        val duBi : Boolean = false,
        val thieuNhi : Boolean = false,
        val duTruong : Boolean = false,
        val huynhTruong : Boolean = false,
        val chiDoanTruong : Boolean = false,
        val phanDoanTruong : Boolean = false,
        val xuDoanTruong : Boolean = false,
        val xuDoanPhoNoi : Boolean = false,
        val xuDoanPhoNgoai : Boolean = false,
        val soDienThoai : String,
        val soDienThoaiSecours : String,
        val soDienThoaiMe: String,
        val soDienThoaiBo: String,
        val soDienThoaiNha: String,
        val diaChiThuongTru : String,
        val diaChiTamTru: String,
        val phanDoan : String,
        val quickName : String,
        val name : String,
        val firstName : String,
        val middleName : String,
        val lastName : String,
        val christianName : String,
        val thuKyXuDoan : Boolean = false,
        val hoTenBo : String,
        val hoTenMe : String,
        val notes : String,
        val soAnhChiEm : Long,
        val thuQuyXuDoan : Boolean,
        val ngheNghiepBo : String,
        val ngheNghiepMe : String,
        val ngheoKho : Boolean = false,
        val dacBiet : Boolean = false,
        val soeur : Boolean = false,
        val thuKyChiDoan : Boolean = false,
        val createdAt : LocalDateTime,
        val updatedAt : LocalDateTime,
        @OneToOne(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY)
        @JoinColumn(name = "id_ten_thanh_bo", nullable = true)
        val tenThanhBo: ChristianName,
        @OneToOne(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY)
        @JoinColumn(name = "id_ten_giao_khu", nullable = true)
        val tenGiaoKhu: ChristianName,
        @OneToOne(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY)
        @JoinColumn(name = "id_ten_thanh_me", nullable = true)
        val tenThanhMe: ChristianName,
        @OneToOne(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY)
        @JoinColumn(name = "id_ten_thanh", nullable = true)
        val tenThanh: ChristianName,
        @OneToMany(cascade = [CascadeType.PERSIST,CascadeType.MERGE], fetch = FetchType.LAZY, mappedBy = "thanhVien")
        val phanBo : MutableSet<PhanBo> = HashSet()
)