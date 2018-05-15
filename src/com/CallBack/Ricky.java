package com.CallBack;

/**
 * @ClassName Ricky
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-15 8:37
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class Ricky implements Student {

    @Override
    public void resolveQuestion(Callback callback) {
        // 模拟解决问题
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }

        // 回调，告诉老师作业写了多久
        callback.tellAnswer(3);
    }

}
