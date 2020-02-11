package com.qf.consumer;

import com.qf.service.IUservice;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author wangwei
 * @Description
 * @ClassName Consumer
 * @date 2020/2/11  10:30
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        // 获取远程服务
        IUservice userService = context.getBean(IUservice.class);
        System.out.println("获取服务器的反馈信息" + userService.hello());

    }
}
