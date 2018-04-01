package com.ssm.mapper;

import com.ssm.userBean.UserBean;

public interface UserMapper {

    public UserBean selectUserById(int id) throws Exception;

}
