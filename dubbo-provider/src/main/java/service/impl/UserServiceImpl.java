package service.impl;

import com.qf.service.IUservice;

/**@Description
 * @ClassName UserServiceImpl
 * @author wangwei
 * @date 2020/2/10  20:47
 */
public class UserServiceImpl implements IUservice {
    public String hello() {
        return "hello-dubbo!";
    }
}
