package com.zqy.stage.member.web.process;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zqy.stage.member.interfaces.IMemberInfo;
import com.zqy.stage.member.model.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MemberProcess {
    Logger logger = LoggerFactory.getLogger(MemberProcess.class);

    @Reference(version = "1.0.0")
    private IMemberInfo memberInfo;

    public Member getMemberInfo(){
        Member member = memberInfo.findMemberInfoById(1);
        return member;
    }

    public Member findByUsername(String username){
        Member member = memberInfo.findByuserName(username);
        return member;
    }
}
