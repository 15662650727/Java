package com.Session;


import com.springMvc.HelloF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Map;


@Controller
@Scope(value = "singleton")
@RequestMapping("/login")
public class Session extends HelloF {
    //http://localhost:8080/login/go
    @Value("${testword}")
    //需要在dispatcher-servlet.xml中的 <context:property-placeholder location="classpath:*.properties" /> 配置
    private String string;

    private int b = 0;
    private static int c = 0;
    @Autowired
    private HelloF helloF;

    @RequestMapping("/go")
    public void testValue(HttpServletRequest request,HttpServletResponse response) throws IOException {
        /** 获得账号密码 **/
        response.sendRedirect("/main.jsp");
//        HttpSession session = request.getSession();
//        String user = request.getParameter("user");
//        String pwd = request.getParameter("pwd");
//        if ("1".equals(user) && "1".equals(pwd)){
//            System.out.println("登录成功");
//            Object a = session.getAttribute("a");
//
//        }




        //session.setMaxInactiveInterval(0);
        //session.setAttribute("a","user");


    }
    // 当需要对用户登陆做验证的时候,可以用到session.
    //
    //用户登陆成功,我们在session.setAttribute("  ", "   ");
    //
    //在session里放一个东西,当需要再默写页面验证的时候,
    //
    //从session里取出这个东西,看时候有,如果有则说明登陆成功.
    //
    //sessioin.getAtrribute("  ", "  ") ;也有键和值对应一种存储.


}
