package com.java.myspringbootdemo02.Common.enums.material;

public enum MaterialStateEnum {
    INFULL(1, "充足"),
    LACK(0, "缺货");

    private final int code;
    private final String message;

    MaterialStateEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static MaterialStateEnum getByCode(int code) {
        if (code==0){
            return LACK;
        }
        for (MaterialStateEnum stateEnum : MaterialStateEnum.values()) {
            if (stateEnum.getCode() == code) {
                return stateEnum;
            }
        }
        return LACK;
    }
}
