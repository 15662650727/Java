package com.Thread;

import static com.file.MusicUtil.play;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-14 10:52
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class ThreadDemo extends ThreadDao implements Runnable {
    public Thread t;
    private String threadName;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName);
    }
    /**
     * 开始
     */
    public void start() {
        Thread threadByName = getThreadByName(threadName);
        if (t == null && threadByName == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}
