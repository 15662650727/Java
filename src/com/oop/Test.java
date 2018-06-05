package com.oop;


import java.io.File;
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



    @org.junit.Test
    public void test2(){
        String str1 = "1";
        String str2 = "2";
        String str3 = "3";
        List list = new ArrayList();
        list.add(str1);
        list.add(str2);
        list.add(str3);

        for (int i = 0; i <list.size() ; i++) {
            String o = (String)list.get(0);
            o = "244";
        }

        System.out.println(list);
    }


    @org.junit.Test
    public void test4(){
        List<String> allFile = getAllFile("D:\\epcp\\upload\\PlateNumber", false);
        System.out.println(allFile);

    }

    @org.junit.Test
    public void test5(){
        List<String> allFile = getAllFile("D:\\epcp\\upload\\PlateNumber", false);
        System.out.println(allFile);

    }
    /**
     * @Autor Zhang Yu
     * @Description 获取所有文件
     * @Date 2018-5-8 10:12
     * @Param [directoryPath, isAddDirectory]
     * @Return java.util.List<java.lang.String>
     **/
    public static List<String> getAllFile(String directoryPath, boolean isAddDirectory) {
        List<String> list = new ArrayList<String>();
        File baseFile = new File(directoryPath);
        if (baseFile.isFile() || !baseFile.exists()) {
            return list;
        }
        File[] files = baseFile.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                if (isAddDirectory) {
                    list.add(file.getAbsolutePath());
                }
                list.addAll(getAllFile(file.getAbsolutePath(), isAddDirectory));
            } else {
                list.add(file.getAbsolutePath());
            }
        }
        return list;
    }

}
