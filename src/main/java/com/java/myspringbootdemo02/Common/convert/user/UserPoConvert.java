package com.java.myspringbootdemo02.Common.convert.user;

import com.java.myspringbootdemo02.Common.enums.user.UserStateEnum;
import com.java.myspringbootdemo02.Common.enums.user.UserStatusEnum;
import com.java.myspringbootdemo02.Common.po.UserPo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.springframework.util.ObjectUtils;

public class UserPoConvert {

    public static UserPo getUserPo(UserVo user) {
        UserPo userPo = new UserPo();
        if (!ObjectUtils.isEmpty(user)) {
            userPo.setId(user.getId());
            userPo.setUserName(user.getUserName());
            userPo.setPassword(user.getPassword());
            userPo.setPhone(user.getPhone());
            userPo.setDept(user.getDept());
            if (UserStateEnum.USING.getState().equals(user.getStatee())){
                userPo.setStatee(UserStateEnum.USING.getCode());
            }else {
                userPo.setStatee(UserStateEnum.DELETED.getCode());
            }
            if (UserStatusEnum.MANAGER.getStatus().equals(user.getStatus())){
                userPo.setStatus(UserStatusEnum.MANAGER.getCode());
            }else {
                userPo.setStatus(UserStatusEnum.EMPLOYEE.getCode());
            }
            userPo.setHireTime(user.getHireTime());
        }
        return userPo;
    }
}
