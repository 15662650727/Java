package com.springMvc;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Map;


@Controller
@Scope(value = "singleton")
@RequestMapping("/a")
public class Hello extends HelloF {
    @Value("${testword}")
    //需要在dispatcher-servlet.xml中的 <context:property-placeholder location="classpath:*.properties" /> 配置
    private String string;

    private int b = 0;
    private static int c = 0;


    @RequestMapping("/b")
    public void testValue() {
        System.out.println("12".hashCode()); //http://localhost:8080/a/b
        System.out.println(string);
        System.out.println(b++);
        int[] d = new int[1];
        try {
            System.out.println(d[2]);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @RequestMapping("/b/{c}")
    @ResponseBody
    public String testValueC(@PathVariable String c) {
        System.out.println(123); //http://localhost:8080/a/b/123
        System.out.println(c);
        return c;
    }

    @RequestMapping("/pic/upload")
    @ResponseBody
    public void pictureUpload(@RequestParam MultipartFile file, HttpServletRequest request) {
        String dirpath = request.getSession().getServletContext().getRealPath("phone");  //获取tomcat 上下文环境路径
        System.out.println(request.getParameter("user"));
        MultipartHttpServletRequest mul=(MultipartHttpServletRequest)request;
        Map<String,MultipartFile> files=mul.getFileMap();
        String fileName;
        File targetFile;
        String targetFileName=null;
        String uploadUrl=request.getSession().getServletContext().getRealPath("/")+"upload";
        File dir=new File(uploadUrl);
        System.out.println(dir);
        if(!dir.exists()) {
            dir.mkdirs();
        }
    }

}
