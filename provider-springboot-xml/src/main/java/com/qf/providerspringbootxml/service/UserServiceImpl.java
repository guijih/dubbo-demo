package com.qf.providerspringbootxml.service;

import com.qf.service.IUservice;

/**@Description
 * @ClassName UserServiceImpl
 * @author wangwei
 * @date 2020/2/10  20:47 123
 */
public class UserServiceImpl implements IUservice {
    @Override
    public String hello() {
        return "hello-dubbo!";
    }
}
