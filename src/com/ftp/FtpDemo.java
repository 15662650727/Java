package com.ftp;


import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.*;
import java.net.SocketException;

public class FtpDemo {

    /**
     * java连接ftp 需要commons-net-3.6.jar
     * 需要本地开启ftp服务,需要关闭各种防火墙软件
     * 最好上传下载不要使用英文,容易出现乱码问题
     * @param args
     */


    public static void main(String[] args) {
        FTPClient ftp =connectFTP("192.168.0.100",21,"anonymous",""); //登陆
        //uploadFile(ftp);//上传
        downFile(ftp);//下载
    }


    //登陆FTP 静态方法
    public static FTPClient  connectFTP(String ftpHost, int ftpPort, String username, String password) {
        //创建ftp
        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient = new FTPClient();
            ftpClient.connect(ftpHost, ftpPort);// 连接FTP服务器
            ftpClient.login(username, password);// 登陆FTP服务器
            int reply = ftpClient.getReplyCode();
            if (!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                System.out.println("登陆失败");
            }else{
                System.out.println("连接ftp成功");
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ftpClient;
    }


    //上传一个文件
    public static void uploadFile(FTPClient ftpClient){
        try {
            FileInputStream in=new FileInputStream(new File("D:/我的.txt"));
            ftpClient.changeWorkingDirectory("D:/FTP资源");
            ftpClient.storeFile("让哇.txt", in);
            in.close();
            ftpClient.logout();
            ftpClient.disconnect();
            System.out.println("上传成功");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //下载文件
    public static void downFile(FTPClient ftp) {
        try {
            ftp.changeWorkingDirectory("D:/FTP资源");//转移到FTP服务器目录
            FTPFile[] fs = ftp.listFiles();
            for(FTPFile ff:fs){
                System.out.println(ff.getName());
                if(ff.getName().equals("test.txt")){
                    File localFile = new File("D:/"+ff.getName());
                    OutputStream is = new FileOutputStream(localFile);
                    ftp.retrieveFile(ff.getName(), is);
                    is.close();
                }
            }
            ftp.logout();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ftp.isConnected()) {
                try {
                    ftp.disconnect();
                } catch (IOException ioe) {
                }
            }
        }
    }
}
