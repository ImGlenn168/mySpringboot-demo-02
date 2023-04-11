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
            userPo.setUserName(user.getUserName());
            userPo.setPassword(user.getPassword());
            userPo.setPhone(user.getPhone());
            userPo.setDept(user.getDept());
            userPo.setStatus(UserStatusEnum.getUserStatusByCode(user.getStatusCode()).getCode());
            userPo.setHireTime(user.getHireTime());
            userPo.setState(UserStateEnum.getUserStatusByCode(user.getStateCode()).getCode());
        }
        return userPo;
    }
}
