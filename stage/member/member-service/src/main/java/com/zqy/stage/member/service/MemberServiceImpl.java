package com.zqy.stage.member.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zqy.stage.member.dao.MemberDao;
import com.zqy.stage.member.interfaces.IMemberInfo;
import com.zqy.stage.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;

// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class MemberServiceImpl implements IMemberInfo {


    @Autowired
    private MemberDao memberDao;


    @Override
    public Member findMemberInfoById(int i) {
        Member member = new Member();
        member.setMemberId(100);
        member.setUserName("zqy教育");

        return member;
    }

    @Override
    public Member findByuserName(String s) {
        return memberDao.findByuserName(s);
    }

}
