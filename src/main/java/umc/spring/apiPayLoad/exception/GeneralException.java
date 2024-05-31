package umc.spring.apiPayLoad.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import umc.spring.apiPayLoad.code.BaseErrorCode;
import umc.spring.apiPayLoad.code.ErrorReasonDTO;

@Getter
@AllArgsConstructor
public class GeneralException extends RuntimeException {
    private BaseErrorCode errorCode;

    public ErrorReasonDTO getErrorReason() {
        return this.errorCode.getReason();
    }
    public ErrorReasonDTO getErrorReasonHttpStatus() {
        return this.errorCode.getReasonHttpStatus();
    }
    public GeneralException(String message) {
        super(message);
    }
}
