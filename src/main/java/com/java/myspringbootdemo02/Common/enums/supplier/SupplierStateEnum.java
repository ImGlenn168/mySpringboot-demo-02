package com.java.myspringbootdemo02.Common.enums.supplier;

public enum SupplierStateEnum {
    COOPERATING(1, "合作中"),
    NONWORKING(0, "待合作");

    private final int code;
    private final String message;

    SupplierStateEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static SupplierStateEnum getByCode(int code) {
        if (code==0){
            return NONWORKING;
        }
        for (SupplierStateEnum stateEnum : SupplierStateEnum.values()) {
            if (stateEnum.getCode() == code) {
                return stateEnum;
            }
        }
        return NONWORKING;
    }
}
