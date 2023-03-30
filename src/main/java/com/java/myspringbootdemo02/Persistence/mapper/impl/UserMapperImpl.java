package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.convert.user.UserPoConvert;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import com.java.myspringbootdemo02.Domain.persistence.IUserDao;
import com.java.myspringbootdemo02.Persistence.mapper.IUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
        return userMapper.addUser(UserPoConvert.getUserPo(userVo));
    }

    @Override
    public int updateUser(UserPo userPo) {
        return userMapper.updateUserById(userPo);
    }

    @Override
    public int deleteUserById(UserPo user) {
        return userMapper.deleteUserById(user);
    }

    @Override
    public int batchAdd(List<UserVo> list) {
        ArrayList<UserPo> userPos = new ArrayList<>();
        for (UserVo userVo : list) {
            userPos.add(UserPoConvert.getUserPo(userVo));
        }
        return userMapper.batchAdd(userPos);
    }

    @Override
    public List<UserPo> findByPage(Map<String, Integer> map) {
        return userMapper.findByPage(map);
    }

}
