package practice.single1_11war.domain.coupon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import practice.single1_11war.domain.member.entity.Member;

import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor
public class IssuedCoupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coupon_template_id", nullable = false)
    private CouponTemplate couponTemplate;

    @Enumerated(EnumType.STRING)
    private IssuedCouponStatus status;

    private LocalDateTime used_date;
}
