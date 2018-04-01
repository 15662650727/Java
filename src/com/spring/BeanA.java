package com.spring;


import org.springframework.stereotype.Controller;

@Controller
public class BeanA {

    public void initBeanA(){
        System.out.println("我是beanA,我被加载了");
    }
}
