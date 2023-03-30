package com.java.myspringbootdemo02.App.service.user.impl;

import com.java.myspringbootdemo02.App.service.user.IUserService;
import com.java.myspringbootdemo02.App.utils.ThreadPoolUtil;
import com.java.myspringbootdemo02.Common.convert.user.UserPoConvert;
import com.java.myspringbootdemo02.Common.convert.user.UserVoConvert;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import com.java.myspringbootdemo02.Domain.persistence.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<UserVo> findAll() {
        List<UserPo> users = userDao.findAll();
        List<UserVo> userVos = new ArrayList<>();
        for (UserPo user : users) {
            userVos.add(UserVoConvert.getUserVo(user));
        }
        return userVos;
    }

    @Override
    public int addUser(UserVo userVo) {
        return userDao.addUser(userVo);
    }

    @Override
    public int updateUserById(UserVo user) {
        return userDao.updateUser(UserPoConvert.getUserPo(user));
    }

    @Override
    public int deleteUserById(UserVo user) {
        return userDao.deleteUserById(UserPoConvert.getUserPo(user));
    }

    @Override
    public List<UserVo> findByPage(Map<String, Integer> map) {
        List<UserPo> userPos = userDao.findByPage(map);
        List<UserVo> userVos = new ArrayList<>();
        for (UserPo userPo : userPos) {
            UserVo userVo = UserVoConvert.getUserVo(userPo);
            userVos.add(userVo);
        }
        return userVos;
    }

    @Override
    public int batchAdd(List<UserVo> list) {
        ArrayList<UserVo> userVos = new ArrayList<>();
        ThreadPoolUtil.execute(new Runnable() {
            @Override
            public void run() {
                for (UserVo userVo : list) {
                    userVo.setStatusCode(2);
                    userVo.setStateCode(1);
                    userVos.add(userVo);
                }
            }
        });
        return userDao.batchAdd(userVos);
    }
}
