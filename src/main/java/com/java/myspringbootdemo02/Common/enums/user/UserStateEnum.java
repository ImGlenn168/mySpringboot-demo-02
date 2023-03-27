package com.java.myspringbootdemo02.Common.enums.user;

public enum UserStateEnum {
    DELETED(-1,"已删除"),
    USING(1,"使用中");

    private int code;
    private String state;

    UserStateEnum(int code, String status) {
        this.code = code;
        this.state = status;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return state;
    }

    public static UserStateEnum getUserStatusByCode(int code){
        if (code==0){
            return UserStateEnum.USING;
        }
        for (UserStateEnum value : UserStateEnum.values()) {
            if (code==value.getCode()){
                return value;
            }
        }
        return UserStateEnum.USING;
    }
}
