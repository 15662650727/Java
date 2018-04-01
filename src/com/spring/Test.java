package com.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test {


    @org.junit.Test
    public void test(){
        //读取src路径下的spring配置文件
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/spring/applicationContext.xml");
        BeanA beanA = (BeanA) ap.getBean("beanA");
        beanA.initBeanA();
    }

    @org.junit.Test
    public void test1(){
        //读取web路径下的spring配置文件
        ApplicationContext ap =new FileSystemXmlApplicationContext("web/WEB-INF/applicationContext.xml");
        BeanA beanA = (BeanA) ap.getBean("beanA");
        beanA.initBeanA();
    }

    @org.junit.Test
    public void test2(){
        //创建一个list 向list中添加字符串3个.然后循环remove掉
        List<String> strList = new ArrayList<>();
        strList.add("0");
        strList.add("1");
        strList.add("2");
        strList.add("3");
        for (String str: strList ){
            System.out.println(str);
        }
        for (int i=0; i<=strList.size();i++){
            strList.remove(0);
        }
        System.out.println(strList);
        //集合是链表 序号永远从0开始
    }




}
