package com.spring.ioc;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.util.Arrays;


/**
 * @author novLi
 * @date 2020年03月03日 14:31
 */
public class Test {
    public static void main(String[] args) {
  /*      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println(context.getBean("helloSpring"));*/
        //注册中心
        BeanDefinitionRegistry registry = new SimpleBeanDefinitionRegistry();
        //读取器
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        //资源读取器
        DefaultResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("spring-config.xml");
        //转载构建定义好的bean
        reader.loadBeanDefinitions(resource);
        System.out.println(Arrays.toString(registry.getBeanDefinitionNames()));
        BeanDefinition bean = registry.getBeanDefinition("helloSpring");
        System.out.println(bean.getBeanClassName());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(factory);

        beanReader.setResourceLoader(new DefaultResourceLoader());

        beanReader.loadBeanDefinitions("spring-config.xml");
        factory.getBean("helloSpring");
    }
}
