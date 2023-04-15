package com.java.myspringbootdemo02.Domain.persistence;

import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserQueryVo;
import com.java.myspringbootdemo02.Common.vo.UserVo;

import java.util.List;
import java.util.Map;

public interface IUserDao {
     List<UserPo> findByCriteria(UserQueryVo userQueryVo);

     List<UserPo> findAllUsers();

     int findUserList(UserQueryVo userQueryVo);

     int addUser(UserVo userVo);

     int updateUser(UserPo userPo);

     int deleteUserById(int id);

     int deleteUserByIds(List<Integer> ids);

     int batchAdd(List<UserVo> list);

     List<UserPo> findByPage(Map<String,Integer> map, UserQueryVo userQueryVo);

     List<String> selectDeptList();

     List<Integer> selectStatusList();

     List<Integer> selectStateList();

     UserPo getById(int id);
}
