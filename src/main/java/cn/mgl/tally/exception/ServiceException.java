package cn.mgl.tally.exception;

import lombok.Data;

@Data
public class ServiceException extends RuntimeException {
    private int statusCode;
    private String errorCode;
    private ServiceException.ErrorType errorType;

    public enum ErrorType {
        CLIENT,
        SERVICE,
        UNKNOW
    }

    public ServiceException(String message) {
        super(message);
    }
}
