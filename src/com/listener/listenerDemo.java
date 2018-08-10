package com.listener;


import com.oop.Hello;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class listenerDemo implements ServletContextListener{

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(1234);
        System.out.println(1234);
        //监听器.启动项目时候时候运行
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(4567);
        System.out.println(4567);
        //监听器.结束项目时候运行
    }
}
