package cn.mgl.tally.exception;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends ServiceException {
    public ResourceNotFoundException(String message) {
        super(message);
        setStatusCode(HttpStatus.NOT_FOUND.value());
        setErrorCode("RESOURCE_NOT_FOUND");
        setErrorType(ErrorType.CLIENT);
    }
}
