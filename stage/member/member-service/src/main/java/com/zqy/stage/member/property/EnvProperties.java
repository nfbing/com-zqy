package com.zqy.stage.member.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 获取配置属性
 *
 * Created by nfbing on 31/08/2018.
 */
@Component
@PropertySource(value = "classpath:config/mapping-url.properties")
@Data
public class EnvProperties {

    @Value("${member_url}")
    private String memberUrl;

    @Override
    public String toString() {
        return "EnvProperties{" +
                ", memberUrl='" + memberUrl + '\'' +
                '}';
    }
}
