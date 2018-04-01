package com.ssm.controller;


import com.ssm.service.UserService;
import com.ssm.userBean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    @ResponseBody
    public String testValueC(@PathVariable int id){
        System.out.println(id); //http://localhost:8080/a/b/123
        UserBean UserBean = userService.getUserByID(id);
        System.out.println(UserBean.toString());

        return "成功";
    }

}
