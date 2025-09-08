package practice.single1_11war.domain.coupon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.single1_11war.domain.coupon.service.IssuedCouponService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/issued-coupons")
public class IssuedCouponController {
    private final IssuedCouponService issuedCouponService;
}
