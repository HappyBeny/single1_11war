package practice.single1_11war.domain.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.order.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
