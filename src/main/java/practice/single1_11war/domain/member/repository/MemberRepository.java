package practice.single1_11war.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import practice.single1_11war.domain.member.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    boolean existsByLoginId(String loginId);
    boolean existsByEmail(String email);
}
