package practice.single1_11war.domain.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.user.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
