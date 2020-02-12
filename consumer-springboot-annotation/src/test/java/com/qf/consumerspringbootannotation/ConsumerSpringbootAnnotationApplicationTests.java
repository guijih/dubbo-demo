package com.qf.consumerspringbootannotation;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.service.IUservice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerSpringbootAnnotationApplicationTests {
    @Reference
    private IUservice uservice;

    @Test
    void contextLoads() {
        uservice.hello();
        System.out.println(uservice.hello());
    }

}
