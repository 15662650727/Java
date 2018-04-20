package com.springMvc;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    @org.junit.Test
    public void test(){
        //读取src路径下的spring配置文件
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/springMvc/dispatcher-servlet.xml");
        Hello he = (Hello)ap.getBean("he");
        System.out.println(he.getHf().hashCode());

        Hello he2 = (Hello)ap.getBean("he");
        System.out.println(he==he2);
    }
    //spring单例模式,子父类并不公用父类成员变量.各自私有.







}
