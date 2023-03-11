package com.java.myspringbootdemo02.App.service.user.impl;

import com.java.myspringbootdemo02.App.service.user.IUserService;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import com.java.myspringbootdemo02.Domain.persistence.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserVo> findAll() {
        List<UserPo> users = userDao.findAll();
        List<UserVo> userVos = new ArrayList<>();
        for (UserPo user : users) {
            userVos.add(new UserVo(user.getId(), user.getUserName(), user.getPassword(),user.getPhone()));
        }
        return userVos;
    }

    @Override
    public int addUser(UserVo userVo) {
        return userDao.addUser(userVo);
    }
}
