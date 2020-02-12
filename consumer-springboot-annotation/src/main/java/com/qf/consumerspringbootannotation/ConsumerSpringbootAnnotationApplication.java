package com.qf.consumerspringbootannotation;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**@Description springboot+dubbo整合
 * @ClassName ConsumerSpringbootAnnotationApplication
 * @author wangwei
 * @date 2020/2/12 0012 15:04
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerSpringbootAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerSpringbootAnnotationApplication.class, args);
    }

}
