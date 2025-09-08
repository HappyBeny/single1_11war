package practice.single1_11war.domain.user.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import practice.single1_11war.global.common.BaseEntity;

@Entity
@Getter
@NoArgsConstructor
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String loginId;

    private String password;

    private String email;

    private String userName;

    private String phone;

    private String address;

    @Enumerated(EnumType.STRING)
    private UserType userType;

    private String sellerNumber;

    private boolean isDeleted;
}
