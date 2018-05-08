package com.sinosoft.prpins.common.exception;

public class BusinessException extends Exception{

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(Throwable e){
        super(e);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

}
