package com.java.myspringbootdemo02.Common.convert.user;

import com.java.myspringbootdemo02.Common.entity.User;
import com.java.myspringbootdemo02.Common.vo.UserVo;

public class UserConvert {

    public static User getUser(UserVo userVo) {
        User user = new User();
        user.setId(userVo.getId());
        user.setUserName(userVo.getUserName());
        user.setPassword(userVo.getPassword());
        user.setPhone(userVo.getPhone());
        user.setDept(userVo.getDept());
        user.setStatus(userVo.getStatus());
        user.setState(userVo.getState());
        user.setHireTime(userVo.getHireTime());
        user.setHireTime(userVo.getHireTime());
        user.setUpdateTime(userVo.getUpdateTime());
        user.setCreateTime(userVo.getCreateTime());
        return user;
    }
}
