package com.zqy.stage.member.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.zqy.stage.member.dao.MemberDao;
import com.zqy.stage.member.interfaces.IMemberInfo;
import com.zqy.stage.member.model.Member;
import com.zqy.stage.member.property.EnvProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class MemberServiceImpl implements IMemberInfo {

    Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private EnvProperties envProperties;


    @Override
    public Member findMemberInfoById(int i) {
        Member member = new Member();
        member.setMemberId(100);
        member.setUserName("zqy教育");

        logger.info("全局变量是==="+envProperties.getMemberUrl());

        return member;
    }

    @Override
    public Member findByuserName(String s) {
        return memberDao.findByuserName(s);
    }

}
