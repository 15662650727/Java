package com.springMvc;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/a")
public class Hello {
    @Value("${testword}")  //需要在dispatcher-servlet.xml中的 <context:property-placeholder location="classpath:*.properties" /> 配置
    private String string;

    @RequestMapping("/b")
    public void testValue(){
        System.out.println(123); //http://localhost:8080/a/b
        System.out.println(string);
    }

    @RequestMapping("/b/{c}")
    @ResponseBody
    public String testValueC(@PathVariable String c){
        System.out.println(123); //http://localhost:8080/a/b/123
        System.out.println(c);
        return c;
    }


}
