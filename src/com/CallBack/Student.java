package com.CallBack;

/**
 * @Autor Zhang Yu
 * @Description 接着定义一个学生接口，学生当然是解决问题，但是接收一个Callback参数，这样学生就知道解决完毕问题向谁报告：
 * @Date 2018-5-15 8:36
 * @Param
 * @Return
 **/
public interface Student {

    public void resolveQuestion(Callback callback);

}
