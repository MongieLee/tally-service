package cn.mgl.tally.exception;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    ResponseEntity<?> exceptionHandler(ServiceException ex) {
        val errorResponse = ErrorResponse.builder()
                .statusCode(ex.getStatusCode())
                .errorType(ex.getErrorType())
                .message(ex.getMessage())
                .code(ex.getErrorCode())
                .build();
        return ResponseEntity
                .status(ex.getStatusCode() != 0 ? ex.getStatusCode() : HttpStatus.INTERNAL_SERVER_ERROR.value())
                .body(errorResponse);
    }
}
