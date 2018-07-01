package com.demo.spring;

import com.demo.spring.bean.people;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean.xml");
        people p = (people) ctx.getBean("cutesource");
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
