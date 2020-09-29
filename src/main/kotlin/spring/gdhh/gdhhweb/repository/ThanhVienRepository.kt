package spring.gdhh.gdhhweb.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import spring.gdhh.gdhhweb.entity.hoso.ThanhVien
@Repository
interface ThanhVienRepository : JpaRepository<ThanhVien,Long> {
}