package service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**@Description 启动spring容器 自动发布服务
 * @ClassName Provider
 * @author wangwei
 * @date 2020/2/10  21:13
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        context.start();
        System.out.println("provider start 发布服务成功了");
        System.in.read();

    }
}
