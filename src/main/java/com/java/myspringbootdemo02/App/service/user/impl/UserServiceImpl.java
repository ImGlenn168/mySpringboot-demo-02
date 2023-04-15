package com.java.myspringbootdemo02.App.service.user.impl;

import com.java.myspringbootdemo02.App.service.user.IUserService;
import com.java.myspringbootdemo02.App.utils.ThreadPoolUtil;
import com.java.myspringbootdemo02.Common.convert.user.UserPoConvert;
import com.java.myspringbootdemo02.Common.convert.user.UserVoConvert;
import com.java.myspringbootdemo02.Common.enums.user.UserStateEnum;
import com.java.myspringbootdemo02.Common.enums.user.UserStatusEnum;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserQueryVo;
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
    public List<UserVo> findByCriteria(UserQueryVo userQueryVo) {
        List<UserPo> users = userDao.findByCriteria(userQueryVo);
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
        UserPo userPo = UserPoConvert.getUserPo(user);
        return userDao.deleteUserById(userPo.getId());
    }

    @Override
    public int deleteUserByIds(List<Integer> ids) {
        return userDao.deleteUserByIds(ids);
    }

    @Override
    public List<UserVo> findByPage(Map<String, Integer> map, UserQueryVo userQueryVo) {
        List<UserPo> userPos = userDao.findByPage(map,userQueryVo);
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

    @Override
    public List<UserVo> findAllUsers() {
        List<UserPo> userPos = userDao.findAllUsers();
        ArrayList<UserVo> userVos = new ArrayList<>();
        for (UserPo userPo : userPos) {
            UserVo userVo = UserVoConvert.getUserVo(userPo);
            userVos.add(userVo);
        }
        return userVos;
    }

    @Override
    public int findUserList(UserQueryVo userQueryVo) {
        return userDao.findUserList(userQueryVo);
    }

    @Override
    public List<String> selectDeptList() {
        return userDao.selectDeptList();
    }

    @Override
    public List<String> selectStatusList() {
        List<Integer> integers = userDao.selectStatusList();
        List<String> userStatusStr = new ArrayList<>();
        for (Integer integer : integers) {
            userStatusStr.add(UserStatusEnum.getUserStatusByCode(integer).getStatus());
        }
        return userStatusStr;
    }

    @Override
    public List<String> selectStateList() {
        List<Integer> integers = userDao.selectStateList();
        List<String> userStateEnums = new ArrayList<>();
        for (Integer integer : integers) {
            userStateEnums.add(UserStateEnum.getUserStatusByCode(integer).getState());
        }
        return userStateEnums;
    }

    @Override
    public UserVo getById(int id) {
        UserPo byId = userDao.getById(id);
        return UserVoConvert.getUserVo(byId);
    }
}
