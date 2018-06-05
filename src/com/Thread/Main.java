package com.Thread;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName Main
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-14 10:54
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class Main {


    public static void main(String[] args) {
        PictureAlarmTask task = new PictureAlarmTask();
        Thread t = new Thread(task, "PicTure");
        t.start();
        System.out.println(Thread.currentThread().getName());

    }

    public static class PictureAlarmTask implements Runnable {
        @Override
        public void run() {
                System.out.println(Thread.currentThread().getName());
        }
    }
}
