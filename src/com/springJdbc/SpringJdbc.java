package com.springJdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/spring")
public class SpringJdbc {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/jdbc")
    public void testValue(){
        System.out.println(jdbcTemplate); //http://localhost:8080/spring/jdbc
        List list =jdbcTemplate.queryForList("SELECT * from a");
        System.out.println(list);
        //至此证明德鲁伊连接池好用.数据库好用


    }

}
