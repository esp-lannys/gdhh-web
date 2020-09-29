package spring.gdhh.gdhhweb.entity.hocba

import lombok.Data
import spring.gdhh.gdhhweb.entity.hoso.PhanBo
import javax.persistence.*

@Entity
@Data
@Table(name = "hocba__bang_diem")
data class BangDiem(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id : String,
        @Column(name = "cc9", nullable = true)
        val cc9: Double,
        @Column(name = "cc10", nullable = true)
        val cc10: Double,
        @Column(name = "cc11", nullable = true)
        val cc11: Double,
        @Column(name = "cc12", nullable = true)
        val cc12: Double,
        @Column(name = "cc1", nullable = true)
        val cc1: Double,
        @Column(name = "cc2", nullable = true)
        val cc2: Double,
        @Column(name = "cc3", nullable = true)
        val cc3: Double,
        @Column(name = "cc4", nullable = true)
        val cc4: Double,
        @Column(name = "cc5", nullable = true)
        val cc5: Double,
        @Column(name = "tb_ccterm1", nullable = true)
        val tbCCTerm1 : Double,
        @Column(name = "quiz_term1", nullable = true)
        val quizTerm1: Double,
        @Column(name = "mid_term1", nullable = true)
        val midTerm1: Double,
        @Column(name = "final_term1", nullable = true)
        val finalTerm1: Double,
        @Column(name = "tb_term1", nullable = true)
        val tbTerm1: Double,
        @Column(name = "tb_glterm1", nullable = true)
        val tbGLTerm1: Double,
        @Column(name = "tb_ccterm2", nullable = true)
        val tbCCTerm2 : Double,
        @Column(name = "quiz_term2", nullable = true)
        val quizTerm2: Double,
        @Column(name = "mid_term2", nullable = true)
        val midTerm2: Double,
        @Column(name = "final_term2s", nullable = true)
        val finalTerm2: Double,
        @Column(name = "tb_term2", nullable = true)
        val tbTerm2: Double,
        @Column(name = "tb_glterm2", nullable = true)
        val tbGLTerm2: Double,
        @Column(name = "tb_glyear", nullable = true)
        val tbGlYear: Double,
        @Column(name = "tb_year", nullable = true)
        val tbYear: Int,
        @Column(name = "sunday_ticket_term1", nullable = true)
        val SundayTicketTerm1: Int,
        @Column(name = "sunday_ticket_term2", nullable = true)
        val SundayTicketTerm2: Int,
        @Column(name = "sunday_tickets", nullable = true)
        val sundayTickets: Int,
        @Column(name = "special_treatment_target", nullable = true)
        val specialTreamentTarget: Int,
        @Column(name = "awarded", nullable = true)
        val awarded : Boolean,
        @Column(name = "submitted")
        val submitted : Boolean = false,
        @Column(name = "special_treatment")
        val specialTreatment : Boolean = false,
        @Column(name = "special_treatment_approved")
        val specialTreatmentApproved : Boolean = false,
        @Column(name = "grade_retention")
        val gradeRetention: Boolean = false,
        @Column(name = "grade_retention_forced")
        val gradeRetentionForced : Boolean = false,
        @Column(name = "free_pass_granted")
        val freePassGranted : Boolean = false,
        @Column(name = "category")
        val category : String,
        @Column(name = "remarks")
        val remarks : String,
        @OneToOne(cascade = [CascadeType.PERSIST, CascadeType.MERGE], mappedBy = "bangDiem")
        @JoinColumn(name = "id_phan_bo")
        val phanBo: PhanBo
)