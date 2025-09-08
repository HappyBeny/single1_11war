package practice.single1_11war.domain.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.order.entity.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long> {
}
