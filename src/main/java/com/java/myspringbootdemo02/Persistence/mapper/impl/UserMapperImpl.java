package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.po.AccountPO;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import com.java.myspringbootdemo02.Domain.persistence.IAccountDao;
import com.java.myspringbootdemo02.Domain.persistence.IUserDao;
import com.java.myspringbootdemo02.Persistence.mapper.IAccountMapper;
import com.java.myspringbootdemo02.Persistence.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        return userMapper.addUser(new UserPo(userVo.getUserName(),
                userVo.getPassword(),userVo.getPhone()));
    }
}
