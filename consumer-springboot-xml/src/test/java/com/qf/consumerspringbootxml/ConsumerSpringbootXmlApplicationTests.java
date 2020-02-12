package com.qf.consumerspringbootxml;

import com.qf.service.IUservice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerSpringbootXmlApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private IUservice userService;

    @Test
    public void contextLoad(){
        System.out.println(userService.hello());
    }

}
