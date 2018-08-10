package com.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpUtils {

    public static String URL_PATH = "http://localhost:8080/photoImg/1c97f00446bf4c1788f5305bd82cfc81.jpg";

    public HttpUtils() {
        // TODO Auto-generated constructor stub
    }

    //把从服务器获得图片的输入流InputStream写到本地磁盘
    public static void saveImageToDisk() {

        InputStream inputStream = getInputStream();
        byte[] data = new byte[1024];
        int len = 0;
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("D:\\test1.jpg");
            while ((len = inputStream.read(data)) != -1) {
                fileOutputStream.write(data, 0, len);

            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

    }

    // 从服务器获得一个输入流(本例是指从服务器获得一个image输入流)
    public static InputStream getInputStream() {
        InputStream inputStream = null;
        HttpURLConnection httpURLConnection = null;

        try {
            URL url = new URL(URL_PATH);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            // 设置网络连接超时时间
            httpURLConnection.setConnectTimeout(3000);
            // 设置应用程序要从网络连接读取数据
            httpURLConnection.setDoInput(true);

            httpURLConnection.setRequestMethod("GET");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                // 从服务器返回一个输入流
                inputStream = httpURLConnection.getInputStream();

            }

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return inputStream;

    }

    public static void main(String args[]) {
//        Map parames = new HashMap<String, String>();
//        parames.put("usrname", "admin");
//        parames.put("id", "Changeme");
//        HttpUtil.getPic("https://192.168.1.9/action/login","");

        HttpClientUtil  httpClientUtil = new HttpClientUtil();
        String httpOrgCreateTest = "https://192.168.1.9/action/login";
        Map<String,String> createMap = new HashMap<String,String>();
        createMap.put("username","admin");
        createMap.put("password","Changeme");
        String httpOrgCreateTestRtn = httpClientUtil.doPost(httpOrgCreateTest,createMap, "utf-8");
        System.out.println("result:"+httpOrgCreateTestRtn);


    }
}
