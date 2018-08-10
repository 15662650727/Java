package com.file;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @ClassName TIme
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-8-5 15:17
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class TIme {
    public static void main(String[] args) {
        String str = "2018-08-05 14:02:16";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
