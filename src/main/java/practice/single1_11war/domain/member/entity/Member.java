package practice.single1_11war.domain.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import practice.single1_11war.domain.member.dto.request.MemberSignUpRequest;
import practice.single1_11war.global.common.BaseEntity;

@Entity
@Getter
@NoArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String memberName;

    @Column(nullable = false)
    private String phone;

    private String address;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    private String sellerNumber;

    @Column(nullable = false)
    private boolean isDeleted;

    private Member(MemberSignUpRequest request, String encodedPW) {
        loginId = request.loginId();
        password = encodedPW;
        email = request.email();
        memberName = request.memberName();
        phone = "010" + request.phone();
        address = request.address();
        memberType = MemberType.NORMAL;
        isDeleted = false;
    }

    public static Member from(MemberSignUpRequest request, String encodedPW) {
        return new Member(request, encodedPW);
    }

    public void changeToSeller(String sellerNumber) {
        this.sellerNumber = sellerNumber;
        this.memberType = MemberType.SELLER;
    }

    public void softDelete() {
        isDeleted = true;
    }

    public void restore() {
        isDeleted = false;
    }
}
