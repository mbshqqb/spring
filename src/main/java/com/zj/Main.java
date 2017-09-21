package com.zj;

import com.zj.biz.UserBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserBiz userBiz=(UserBiz)context.getBean("userBiz");
        userBiz.sayHello();
    }
}
