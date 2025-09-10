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

    private String loginId;

    private String password;

    private String email;

    private String memberName;

    private String phone;

    private String address;

    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    private String sellerNumber;

    private boolean isDeleted;

    private Member(MemberSignUpRequest request) {
        loginId = request.loginId();
        password = request.password();
        email = request.email();
        memberName = request.memberName();
        phone = request.phone();
        address = request.address();
        memberType = MemberType.NORMAL;
        isDeleted = false;
    }

    public static Member of(MemberSignUpRequest request) {
        return new Member(request);
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
