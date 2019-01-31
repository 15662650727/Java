package com.ssm;

import com.ssm.mapper.UserMapper;
import com.ssm.userBean.UserBean;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @ClassName BaseTestMybaits
 * @Description TODO
 * @Author Zhang Yu
 * @Date 2018-9-19 9:58
 * @Version 1.0
 * Copyright © 2018 山东创德软件技术有限公司. All rights reserved.
 **/
public class BaseTestMybaits {

    public static void main(String[] args) {
        try{
            Reader reader=Resources.getResourceAsReader("SqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            reader.close();
            SqlSession sqlSession = sqlSessionFactory.openSession();
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
            UserBean userBean = userMapper.selectUserById(1);
            System.out.println(userBean);
        }catch(Exception ignore){
            ignore.printStackTrace();
        }

    }
}
