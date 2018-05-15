package com.CallBack;

import org.junit.Test;

/**
 * @ClassName CallbackTest
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-5-15 8:40
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class CallbackTest {

    @Test
    public void testCallback() {
        Student student = new Ricky();
        Teacher teacher = new Teacher(student);

        teacher.askQuestion();

    }

}