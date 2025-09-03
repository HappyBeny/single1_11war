package practice.single1_11war.domain.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
