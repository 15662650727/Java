package com.Thread;

import static com.file.MusicUtil.play;

/**
 * @ClassName ThreadDemo
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-14 10:52
 * @Version 1.0
 **/
public class ThreadDemo1 extends Thread{


    public synchronized void run() {
        play("C:\\Users\\Administrator\\Desktop\\1.mp3");
    }


}
