package com.GuiDemo;

import javax.swing.*;
import java.awt.*;

public class GuiDemo {




    public static void main(String[] args) {
        JFrame f=new JFrame("视频窗口");
        f.setSize(700,500);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(true);
        //f.setLocationRelativeTo(null) ;
        //f.setLayout(null);  //设置窗体布局为空布局
        JPanel p=new JPanel();             //实例化一个面板
        //设置面板背景色为蓝色，如果不引入AWT包，程序将出错，可以试试看
        p.setBackground(Color.BLUE);
        p.setSize(300,300);          //设置面板对象大小
        f.getContentPane().add(p,BorderLayout.CENTER);     //将面板添加到窗体中
        //如果使用下面添加面板的方法，面板将布满整个窗口，可以试试看
        //f. setContentPane(p);
    }


}
