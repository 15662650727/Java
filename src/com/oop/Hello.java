package com.oop;

public class Hello {
    //这也属于静态
    private static GroudFather gr = new GroudFather();
    private static Hello hello = null;

    static {
        //在该类被ClassLoader加载时就初始化一个SerialTool对象
        if (hello == null) {
            System.out.println(123);
            hello = new Hello();
        }
    }

    private Hello(){
        System.out.println("hello构造");
    }

    public static void get() {
        System.out.println(234);
    }




}
