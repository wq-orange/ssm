package com.spring;

import com.spring.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 南柯
 * @date 2021/4/8 16:02
 */
public class Test01 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User username = (User)context.getBean("username");
        System.out.println(username.toString());
    }
}
