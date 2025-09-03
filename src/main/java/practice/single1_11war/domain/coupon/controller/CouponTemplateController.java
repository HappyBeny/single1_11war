package practice.single1_11war.domain.coupon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.single1_11war.domain.coupon.service.CouponTemplateService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/coupon-templates")
public class CouponTemplateController {
    private final CouponTemplateService couponTemplateService;
}
