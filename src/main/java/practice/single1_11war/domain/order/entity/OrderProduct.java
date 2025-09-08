package practice.single1_11war.domain.order.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import practice.single1_11war.domain.coupon.entity.IssuedCoupon;
import practice.single1_11war.domain.product.entity.Product;

@Getter
@Entity
@NoArgsConstructor
public class OrderProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "issued_coupon_id", nullable = false)
    private IssuedCoupon issuedCoupon;

    private String productName;

    private int unitPrice;

    private int quantity;

    private int originalTotalPrice;

    private int discount;

    private int finalTotalPrice;
}
