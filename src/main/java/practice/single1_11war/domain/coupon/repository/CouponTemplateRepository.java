package practice.single1_11war.domain.coupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.coupon.entity.CouponTemplate;

public interface CouponTemplateRepository extends JpaRepository<CouponTemplate, Long> {
}
