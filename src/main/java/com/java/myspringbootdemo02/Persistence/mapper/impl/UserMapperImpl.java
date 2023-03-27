package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.enums.user.UserStatusEnum;
import com.java.myspringbootdemo02.Common.po.AccountPO;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import com.java.myspringbootdemo02.Domain.persistence.IAccountDao;
import com.java.myspringbootdemo02.Domain.persistence.IUserDao;
import com.java.myspringbootdemo02.Persistence.mapper.IAccountMapper;
import com.java.myspringbootdemo02.Persistence.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.List;

@Repository
public class UserMapperImpl implements IUserDao {

    @Autowired
    private IUserMapper userMapper;

    @Override
    public List<UserPo> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int addUser(UserVo userVo) {
        return userMapper.addUser(getUserVo(userVo));
    }

    @Override
    public int updateUser(UserPo userPo) {
        return userMapper.updateUserById(userPo);
    }

    @Override
    public int deleteUserById(UserPo user) {
        return userMapper.deleteUserById(user);
    }

    private UserPo getUserVo(UserVo user) {
        UserPo userPo = new UserPo();
        userPo.setUserName(user.getUserName());
        userPo.setPassword(user.getPassword());
        userPo.setPhone(user.getPhone());
        userPo.setDept(user.getDept());
        userPo.setStatus(user.getStatusCode());
        userPo.setHireTime(user.getHireTime());
        userPo.setState(user.getStateCode());
        return userPo;
    }
}
