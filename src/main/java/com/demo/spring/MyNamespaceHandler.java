package com.demo.spring;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author haishen
 * @date 2018/6/17
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        System.out.println("234");
        registerBeanDefinitionParser("people", new PeopleBeanDefinitionParser());
    }
}
