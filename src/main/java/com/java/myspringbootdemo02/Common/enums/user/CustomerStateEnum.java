package com.java.myspringbootdemo02.Common.enums.user;

public enum CustomerStateEnum {
    ACTIVATED(1,"已激活"),
    WAITING(0,"待激活");

    private int code;
    private String state;

    CustomerStateEnum(int code, String state) {
        this.code = code;
        this.state = state;
    }

    public int getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

    public static CustomerStateEnum getStateByCode(int code){
        if (code==0){
            return CustomerStateEnum.WAITING;
        }
        for (CustomerStateEnum value : CustomerStateEnum.values()) {
            if (code==value.getCode()){
                return value;
            }
        }
        return CustomerStateEnum.WAITING;
    }
}
