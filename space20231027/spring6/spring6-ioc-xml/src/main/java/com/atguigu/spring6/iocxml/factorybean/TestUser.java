package com.atguigu.spring6.iocxml.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    public static void main(String[] args) {
        /*
        FactoryBean是Spring提供的一种整合第三方框架的常用机制。和普通的bean不同，
        配置一个FactoryBean类型的bean，在获取bean的时候得到的并不是class属性中配置
        的这个类的对象，而是getObject()方法的返回值。通过这种机制，Spring可以帮我们把复杂
        组件创建的详细过程和繁琐细节都屏蔽起来，只把最简洁的使用界面展示给我
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factory.xml");
        User user = (User)context.getBean("user");
        System.out.println(user);
    }
}
