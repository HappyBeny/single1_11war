package practice.single1_11war.domain.member.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record MemberSignUpRequest(
        @NotBlank(message = "로그인에 사용할 아이디를 입력해주세요.")
        @Size(min = 6, max = 12, message = "아이디는 6자 이상, 12자 이하의 문자열로 작성해주세요.")
        @Pattern(regexp = "^[a-zA-Z0-9]{6,12}$", message = "아이디는 영어와 숫자로만 구성할 수 있습니다.")
        String loginId,

        @NotBlank(message = "비밀번호를 입력해주세요.")
        @Size(min = 12, max = 20, message = "비밀번호는 12자 이상, 20자 미만으로 작성해주세요.")
        @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{12,19}$",
                message = "비밀번호는 영어, 숫자, 특수문자를 모두 포함해야 합니다.")
        String password,

        @NotBlank(message = "이메일을 입력해주세요.")
        @Email(message = "올바른 이메일 형식을 입력해주세요.")
        String email,

        @NotBlank(message = "이름을 입력해주세요.")
        String memberName,

        @NotBlank(message = "전화번호를 입력해주세요.")
        @Pattern(regexp = "^[0-9]{8}$", message = "전화번호는 특수문자 없이 8자리 숫자만 입력해주세요.")
        String phone,

        String address
) {

}
