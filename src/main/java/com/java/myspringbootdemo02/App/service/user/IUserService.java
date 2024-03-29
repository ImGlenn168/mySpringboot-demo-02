package com.java.myspringbootdemo02.App.service.user;

import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserQueryVo;
import com.java.myspringbootdemo02.Common.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface IUserService {

    List<UserVo> findByCriteria(UserQueryVo userQueryVo);

    int addUser(UserVo userVo);

    int updateUserById(UserVo userVo);

    int deleteUserById(UserVo user);

    int deleteUserByIds(List<Integer> ids);

    List<UserVo> findByPage(Map<String,Integer> map, UserQueryVo userQueryVo);

    int batchAdd(List<UserVo> list);

    List<UserVo> findAllUsers();

    int findUserList(UserQueryVo userQueryVo);

    List<String> selectDeptList();

    List<String> selectStatusList();

    List<String> selectStateList();

    UserVo getById(int id);
}
