package com.ssm.controller;


import com.ssm.service.MenuService;
import com.ssm.service.UserService;
import com.ssm.userBean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier("menuServiceImpl2")     //次数Qualifier 为解除接口有两个实现类不知道注入哪个 bean别名为第一个字母小写
    private MenuService menuService;

    @RequestMapping("/{id}")
    @ResponseBody
    public String testValueC(@PathVariable int id){
        System.out.println(id); //http://localhost:8080/a/b/123
        UserBean userBean = userService.getUserByID(id);
        System.out.println(userBean.toString());

        return "成功";
    }

}
