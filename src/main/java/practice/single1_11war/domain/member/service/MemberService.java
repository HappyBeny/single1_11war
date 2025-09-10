package practice.single1_11war.domain.member.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practice.single1_11war.domain.member.dto.request.MemberSignUpRequest;
import practice.single1_11war.domain.member.dto.response.MemberResponse;
import practice.single1_11war.domain.member.entity.Member;
import practice.single1_11war.domain.member.repository.MemberRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public MemberResponse signUp(MemberSignUpRequest request) {
        validateDuplicate(request);

        String encodedPW = passwordEncoder.encode(request.password());
        Member member = Member.from(request, encodedPW);
        memberRepository.save(member);

        return MemberResponse.from(member);
    }

    public MemberResponse getMember(int memberId) {
        Member foundMember = memberRepository.findById(memberId).orElseThrow();
        validateDeleted(foundMember);
        return MemberResponse.from(foundMember);
    }

    public List<MemberResponse> getAllMembersForAdmin() {
        List<Member> foundMembers = memberRepository.findAll();

        return foundMembers.stream().map(MemberResponse::from).toList();
    }


    private void validateDuplicate(MemberSignUpRequest request) {
        if (memberRepository.existsByLoginId(request.loginId())) {
            throw new IllegalArgumentException("이미 사용 중인 아이디입니다.");
        }
        if (memberRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("이미 사용 중인 이메일입니다.");
        }
    }

    private void validateDeleted(Member member) {
        if (member.isDeleted()) {
            throw new IllegalArgumentException("삭제된 사용자입니다.");
        }
    }
}
