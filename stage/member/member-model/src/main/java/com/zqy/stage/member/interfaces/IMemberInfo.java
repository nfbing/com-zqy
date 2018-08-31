package com.zqy.stage.member.interfaces;

import com.zqy.stage.member.model.Member;

public interface IMemberInfo {
    /**
     * 根据会员id获取会员信息
     * @param id
     * @return
     */
    Member findMemberInfoById(int id);

    Member findByuserName(String userName);
}
