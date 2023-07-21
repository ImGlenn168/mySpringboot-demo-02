package com.java.myspringbootdemo02.Common.enums.customer;

import com.alibaba.excel.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public enum CustomerStateEnum {
    ACTIVATED(1, "已激活"),
    WAITING(0, "待激活");

    private int code;
    private String state;

    private static volatile Map<String, String> MY_MAP;

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

    public static CustomerStateEnum getStateByCode(int code) {
        if (code == 0) {
            return CustomerStateEnum.WAITING;
        }
        for (CustomerStateEnum value : CustomerStateEnum.values()) {
            if (code == value.getCode()) {
                return value;
            }
        }
        return CustomerStateEnum.WAITING;
    }

    public static Map<String, String> checkCode(String state) {
        if (StringUtils.isEmpty(state)) {
            return null;
        }
        if (MY_MAP == null) {
            synchronized (CustomerStateEnum.class) {
                if (MY_MAP == null) {
                    MY_MAP = new HashMap<>();
                    for (CustomerStateEnum value : CustomerStateEnum.values()) {
                        MY_MAP.put("state", value.state);
                    }
                }
            }
        }
        return MY_MAP;
    }
}
