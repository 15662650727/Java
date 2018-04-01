package com.springMvc;


import com.spring.BeanA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {


    @org.junit.Test
    public void test(){
        //读取src路径下的spring配置文件
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/springMvc/dispatcher-servlet.xml");
    }








}
