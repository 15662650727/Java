package com.springJdbc;

import com.spring.BeanA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class springJdbcTest {

    @org.junit.Test
    public void test(){
        //测试数据库和SpringJdbc可以通过
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/springJdbc/dispatcher-servlet.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ap.getBean("jt");
        List list =jdbcTemplate.queryForList("SELECT * from a");
        System.out.println(list);

    }

    @org.junit.Test
    public void test2(){
        //测试数据库和SpringJdbc可以通过
        ApplicationContext ap = new ClassPathXmlApplicationContext("com/springJdbc/dispatcher-servlet.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ap.getBean("jt");
        System.out.println(jdbcTemplate.getDataSource());

    }

}
