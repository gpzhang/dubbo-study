package com.demo.spring;

import com.demo.spring.bean.people;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author haishen
 * @date 2018/6/17
 */

public class PeopleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class getBeanClass(Element element) {
        return people.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String name = element.getAttribute("name");
        String age = element.getAttribute("age");
        String id = element.getAttribute("id");
        if (StringUtils.hasText(id)) {
            bean.addPropertyValue("id", id);
        }
        if (StringUtils.hasText(name)) {
            bean.addPropertyValue("name", name);
        }
        if (StringUtils.hasText(age)) {
            bean.addPropertyValue("age", Integer.valueOf(age));
        }
        System.out.println("123");
    }
}
