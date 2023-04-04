package com.java.myspringbootdemo02.Common.enums.order;

public enum OrderStateEnum {
    FINISHED(1, "已完成"),
    WAITING(0, "进行中"),
    CANCELED(-1, "已取消");

    private final int code;
    private final String message;

    OrderStateEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static OrderStateEnum getByCode(int code) {
        if (code!=0){
            for (OrderStateEnum stateEnum : OrderStateEnum.values()) {
                if (stateEnum.getCode() == code) {
                    return stateEnum;
                }
            }
        }else {
            return WAITING;
        }
        return CANCELED;
    }
}
