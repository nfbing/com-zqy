package com.zqy.stage.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zqy.stage.member.dao")
public class MemberServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(MemberServiceApplication.class,args);
    }
}

