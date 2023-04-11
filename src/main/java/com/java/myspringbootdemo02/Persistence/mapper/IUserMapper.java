package com.java.myspringbootdemo02.Persistence.mapper;

import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserQueryVo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IUserMapper {

    List<UserPo> findByCriteria(UserQueryVo userQueryVo);

    List<UserPo> findAllUsers();
    List<UserPo> findByPage(Map<String,Integer> map, UserQueryVo userQueryVo);

    int addUser(UserPo userPo);

    int updateUserById(UserPo userPo);

    int deleteUserById(int id);

    int deleteUserByIds(List<Integer> ids);
    int batchAdd(List<UserPo> list);

    int findUserListCount(UserQueryVo userQueryVo);

    List<String> selectDeptList();

    List<Integer> selectStatusList();

    List<Integer> selectStateList();
}
