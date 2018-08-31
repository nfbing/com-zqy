package com.zqy.stage.member.web.controller;

import com.zqy.stage.member.model.Member;
import com.zqy.stage.member.web.process.MemberProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberProcess memberProcess;

    @RequestMapping("/getMemberInfo")
    public Member getMemberInfo(){
        return memberProcess.getMemberInfo();
    }

    @RequestMapping("/findMemberInfo")
    public Member findByUserName(@RequestParam("username") String username){
        return memberProcess.findByUsername(username);
    }

}
