package org.study.properties.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties
@PropertySource(value = "classpath:sms.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "shop")
public class ShopProperties {
    @Getter
    private final Map<String, SmsApiConfig> branch = new HashMap<>();


}
