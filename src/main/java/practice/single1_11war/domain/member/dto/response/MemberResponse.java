package practice.single1_11war.domain.member.dto.response;

import practice.single1_11war.domain.member.entity.Member;
import practice.single1_11war.domain.member.entity.MemberType;

public record MemberResponse(
        String loginId,
        String email,
        String memberName,
        String phone,
        String address,
        MemberType memberType
) {
    public static MemberResponse from(Member member) {
        return new MemberResponse(
                member.getLoginId(),
                member.getEmail(),
                member.getMemberName(),
                member.getPhone(),
                member.getAddress(),
                member.getMemberType()
        );
    }
}
