package com.qf.providerbootannotation;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**@Description dubbo注解方式
 * @ClassName ProviderBootAnnotationApplication
 * @author wangwei
 * @date 2020/2/12  14:46
 */
@SpringBootApplication
@EnableDubbo
public class ProviderBootAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderBootAnnotationApplication.class, args);
    }

}
