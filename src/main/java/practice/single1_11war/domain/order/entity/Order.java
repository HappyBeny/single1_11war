package practice.single1_11war.domain.order.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import practice.single1_11war.domain.member.entity.Member;

import java.time.LocalDateTime;

@Entity
@Table(name = "`order`")
@Getter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Member member;

    private int totalPrice;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime orderDate;
}
