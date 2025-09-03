package practice.single1_11war.global.exception;

import lombok.Getter;
import practice.single1_11war.global.exception.enums.ErrorCode;

@Getter
public class BusinessException extends RuntimeException {
    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
      super(errorCode.getMessage());
      this.errorCode = errorCode;
    }
}
