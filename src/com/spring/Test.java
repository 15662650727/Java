package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {


    @org.junit.Test
    public void test(){
        //读取src路径下的spring配置文件
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        BeanA beanA = (BeanA) ap.getBean("beanA");
        beanA.initBeanA();
        System.out.println(123);
    }

    @org.junit.Test
    public void test1(){
        //读取web路径下的spring配置文件
        ApplicationContext ap =new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        BeanA beanA = (BeanA) ap.getBean("beanA");
        beanA.initBeanA();
    }


}
