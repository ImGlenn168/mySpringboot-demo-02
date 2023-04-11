package com.java.myspringbootdemo02.Persistence.mapper.impl;

import com.java.myspringbootdemo02.Common.convert.user.UserPoConvert;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserQueryVo;
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
    public List<UserPo> findByCriteria(UserQueryVo userQueryVo) {
        return userMapper.findByCriteria(userQueryVo);
    }

    @Override
    public List<UserPo> findAllUsers() {
        return userMapper.findAllUsers();
    }

    @Override
    public int findUserList(UserQueryVo userQueryVo) {
        return userMapper.findUserListCount(userQueryVo);
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
    public int deleteUserById(int id) {
        return userMapper.deleteUserById(id);
    }

    @Override
    public int deleteUserByIds(List<Integer> ids) {
        return userMapper.deleteUserByIds(ids);
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
    public List<UserPo> findByPage(Map<String, Integer> map, UserQueryVo userQueryVo) {
        return userMapper.findByPage(map,userQueryVo);
    }

    @Override
    public List<String> selectDeptList() {
        return userMapper.selectDeptList();
    }

    @Override
    public List<Integer> selectStatusList() {
        return userMapper.selectStatusList();
    }

    @Override
    public List<Integer> selectStateList() {
        return userMapper.selectStateList();
    }
}
