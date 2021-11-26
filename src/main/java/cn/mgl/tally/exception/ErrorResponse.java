package cn.mgl.tally.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private int statusCode;
    private String code;
    private String message;
    private ServiceException.ErrorType errorType;
}
