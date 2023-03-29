package com.java.myspringbootdemo02.App.exception;

import lombok.Data;

@Data
public class MyApplicationException extends RuntimeException {


    public MyApplicationException() {
    }

    public MyApplicationException(String message) {
        super(message);
    }
}
