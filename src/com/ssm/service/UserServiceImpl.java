package com.ssm.service;

import com.ssm.mapper.UserMapper;
import com.ssm.userBean.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserBean getUserByID(int id) {
        UserBean userBean=null;
        try {
             userBean = userMapper.selectUserById(id);

        }catch (Exception e){
            e.printStackTrace();
        }

        return userBean;
    }


}
