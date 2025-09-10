package practice.single1_11war.domain.member.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.single1_11war.domain.member.dto.request.MemberSignUpRequest;
import practice.single1_11war.domain.member.dto.response.MemberResponse;
import practice.single1_11war.domain.member.service.MemberService;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/sign-up")
    public MemberResponse signUp(@Valid @RequestBody MemberSignUpRequest request) {
        return memberService.signUp(request);
    }
}
