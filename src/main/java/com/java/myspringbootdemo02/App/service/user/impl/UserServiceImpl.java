package com.java.myspringbootdemo02.App.service.user.impl;

import com.java.myspringbootdemo02.App.service.user.IUserService;
import com.java.myspringbootdemo02.Common.enums.user.UserStateEnum;
import com.java.myspringbootdemo02.Common.enums.user.UserStatusEnum;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import com.java.myspringbootdemo02.Domain.persistence.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
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
            userVos.add(getUserVo(user));
        }
        return userVos;
    }

    private UserVo getUserVo(UserPo user) {
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setUserName(user.getUserName());
        userVo.setPhone(user.getPhone());
        userVo.setDept(user.getDept());
        userVo.setStatusCode(UserStatusEnum.getUserStatusByCode(user.getStatus()).getCode());
        userVo.setStatus(UserStatusEnum.getUserStatusByCode(user.getStatus()).getStatus());
        userVo.setHireTime(user.getHireTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        userVo.setCreateTime(simpleDateFormat.format(user.getCreateTime()));
        userVo.setUpdateTime(simpleDateFormat.format(user.getUpdateTime()));
        userVo.setStateCode(UserStateEnum.getUserStatusByCode(user.getState()).getCode());
        userVo.setState(UserStateEnum.getUserStatusByCode(user.getState()).getStatus());
        return userVo;
    }

    @Override
    public int addUser(UserVo userVo) {
        return userDao.addUser(userVo);
    }

    @Override
    public int updateUserById(UserVo user) {
        return userDao.updateUser(getUserPo(user));
    }

    private UserPo getUserPo(UserVo user) {
        UserPo userPo = new UserPo();
        userPo.setId(user.getId());
        userPo.setUserName(user.getUserName());
        userPo.setPassword(user.getPassword());
        userPo.setPhone(user.getPhone());
        userPo.setDept(user.getDept());
        userPo.setStatus(user.getStatusCode());
        userPo.setHireTime(user.getHireTime());
        userPo.setState(user.getStateCode());
        return userPo;
    }

    @Override
    public int deleteUserById(UserVo user) {
        return userDao.deleteUserById(getUserPo(user));
    }
}
