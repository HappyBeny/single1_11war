package practice.single1_11war.domain.order.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.single1_11war.domain.order.service.OrderProductService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/order-products")
public class OrderProductController {
    private final OrderProductService orderProductService;
}
