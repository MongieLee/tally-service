package cn.mgl.tally.exception;

import org.springframework.http.HttpStatus;

public class InvalidParameterException extends ServiceException {
    public InvalidParameterException(String message) {
        super(message);
        setStatusCode(HttpStatus.BAD_REQUEST.value());
        setErrorCode("INVALID_PARAMETER");
        setErrorType(ErrorType.CLIENT);
    }
}
