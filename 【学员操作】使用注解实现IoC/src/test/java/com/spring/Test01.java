package com.spring;

import com.spring.pojo.User;
import com.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南柯
 * @date 2021/4/8 17:26
 */
public class Test01 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userservice = (UserService) context.getBean("userservice");
        User user = new User();
        user.setName("小球");
        user.setAge(18);
        userservice.save(user);
    }
}
