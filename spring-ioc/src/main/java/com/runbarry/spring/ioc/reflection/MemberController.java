package com.runbarry.spring.ioc.reflection;

/**
 * @author xbuding
 * @version 1.0
 * @since 2020/5/11
 */
public class MemberController {

    private MemberService memberService;

    public MemberService getMemberService() {
        return memberService;
    }

    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
}
