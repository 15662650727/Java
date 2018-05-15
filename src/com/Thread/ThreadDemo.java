package com.Thread;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-14 10:52
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class ThreadDemo implements Runnable{
    public Thread t;
    private String threadName;
    boolean suspended=true;

    public ThreadDemo(String threadName){
        this.threadName=threadName;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println(this);
        for(int i = 10; i > 0; i--) {
            System.out.println("Thread: " + threadName + ", " + i);
            // Let the thread sleep for a while.
            try {
                Thread.sleep(300);

                synchronized(this) {
                    while(suspended) {
                        wait();
                    }
                }

            } catch (InterruptedException e) {
                System.out.println("Thread " +  threadName + " interrupted.");
                e.printStackTrace();
            }
            System.out.println("Thread " +  threadName + " exiting.");
        }
    }

    /**
     * 开始
     */
    public void start(){
        System.out.println("Starting " +  threadName );
        if(t==null){
            t=new Thread(this, threadName);
            t.start();
        }
    }

    /**
     * 暂停
     */
    void suspend(){
        suspended = true;
    }

    /**
     * 继续
     */
    synchronized void resume(){
        suspended = false;
        notify();
    }
}
