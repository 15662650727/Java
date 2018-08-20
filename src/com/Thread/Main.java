package com.Thread;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-14 10:54
 * @Version 1.0
 **/
public class Main {


    public static void main(String[] args) {


//            ThreadDemo t = new ThreadDemo("music","san","12");
//            t.start();
//        System.out.println(1234);

        for (int i = 0; i <3 ; i++) {
            ThreadDemo t = new ThreadDemo("robotStart");
            t.start();
        }


    }


}
