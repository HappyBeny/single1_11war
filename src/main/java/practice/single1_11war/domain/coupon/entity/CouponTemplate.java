package practice.single1_11war.domain.coupon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class CouponTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String couponName;

    @Enumerated(EnumType.STRING)
    private CouponType couponType;

    private int discountAmount;

    @Enumerated(EnumType.STRING)
    private CouponStatus couponStatus;

    private int quantity;

    private int issuedQuantity;

    private LocalDateTime startDate;

    private LocalDateTime endDate;
}
