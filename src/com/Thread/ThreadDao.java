package com.Thread;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-14 10:52
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class ThreadDao {



    public static Thread getThreadByName(String threadName) {
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            if (t.getName().equals(threadName)) return t;
        }
        return null;
    }

}
