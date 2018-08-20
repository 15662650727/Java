package com.oop;

/**
 * @ClassName GroudFather
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-31 10:20
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class GroudFather {


    public GroudFather(){
        System.out.println("GroudFather构造");
    }

    public void start(){
        System.out.println("输出父类");
    }

}

//
//public class ExA {
//    static {
//        System.out.println("父类--静态代码块");
//    }
//
//    public ExA() {
//        System.out.println("父类--构造函数");
//    }
//
//    {
//        System.out.println("父类--非静态代码块");
//    }
//
//    public static void main(String[] args) {
//        new ExB();
//    }
//}

//class ExB extends ExA {
//    static {
//        System.out.println("子类--静态代码块");
//    }
//    {
//        System.out.println("子类--非静态代码块");
//    }
//
//    public ExB() {
//        System.out.println("子类--构造函数");
//    }
//}
//
//执行结果  new类顺序
//        =====
//        父类--静态代码块
//        本类--静态代码块
//        父类--非静态代码块
//        父类--构造函数
//        本类--非静态代码块
//        本类--构造函数