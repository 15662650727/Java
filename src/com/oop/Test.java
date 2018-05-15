package com.oop;


import java.util.*;

public class Test extends Thread{

    public static String age;
    public static void main(String[] args) {
        System.out.print(1);
        System.out.print(1);
        System.out.print(1);
        System.out.print(1);

        new Thread("线程1"){
            @Override
            public void run(){
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
                System.out.print(1);
            }
        }.start();
        System.out.print(2);
    }

    public void run() {
        System.out.println("123");
    }

    @org.junit.Test
    public void test(){
        Map map = new HashMap();

        map.put("张三", "12");
        map.put("李四", "25");
        map.put("王五", "50");

        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
        System.out.println(list);


        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            //降序排序
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                //return o1.getValue().compareTo(o2.getValue());
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<String, String> mapping : list) {
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }

    }




    @org.junit.Test
    public void test3(){
        String str = new String();
        str = "b";
        String afterappend = appendString(str);
        System.out.println(afterappend);


    }

    public static String appendString(String string){
        String str = string + "a";
        return str;
    }

    @org.junit.Test
    public void test1(){

        int a = 7;
        switch (a) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
            default:
                System.out.println(4);
                break;
        }

    }


    public static void test(HelloFather father){
        System.out.println(father.getStrf());

    }





}
