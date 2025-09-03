package practice.single1_11war.domain.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.cart.entity.CartProduct;

public interface CartProductRepository extends JpaRepository<CartProduct, Integer> {
}
