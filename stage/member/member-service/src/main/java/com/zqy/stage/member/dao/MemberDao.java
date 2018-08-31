package com.zqy.stage.member.dao;

import com.zqy.stage.member.model.Member;

public interface MemberDao {

    Member findByuserName(String userName);
}
