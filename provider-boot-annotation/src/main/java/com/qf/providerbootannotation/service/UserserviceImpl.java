package com.qf.providerbootannotation.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.service.IUservice;
import org.springframework.stereotype.Component;

/**@Description userservice实现类
 * @ClassName UserserviceImpl
 * @author wangwei
 * @date 2020/2/12  14:50
 */
@Component //表名这是一个sping组件,受spring管理
@Service
public class UserserviceImpl implements IUservice {
    @Override
    public String hello() {
        return "springboot+dubbo!!!";
    }
}
