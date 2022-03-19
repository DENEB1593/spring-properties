package org.study.properties.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShopPropertiesTest {

    @Autowired
    private ShopProperties shopProperties;

    @Test
    void propertiesTest() {
        Map<String, SmsApiConfig> branch = shopProperties.getBranch();

        SmsApiConfig mainBranchConfig = branch.get("main");

        assertEquals(mainBranchConfig.getHost(), "main branch host");
    }
}