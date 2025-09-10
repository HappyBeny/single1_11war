package practice.single1_11war.domain.member.dto.request;

public record MemberSignUpRequest(
        String loginId,
        String password,
        String email,
        String memberName,
        String phone,
        String address
) {

}
