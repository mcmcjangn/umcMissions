package umc.spring.apiPayLoad.code.status;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.spring.apiPayLoad.code.BaseCode;
import umc.spring.apiPayLoad.code.ReasonDTO;

@Getter
public enum SuccessStatus implements BaseCode {
    _OK("OK", "200", true);

    private String message;
    // getCode 메소드 추가
    private String code;
    private boolean isSuccess;

    private SuccessStatus(String message, String code, boolean isSuccess) {
        this.message = message;
        this.code = code;
        this.isSuccess = isSuccess;
    }


    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder().message(this.message).code(this.code).isSuccess(this.isSuccess).build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder().message(this.message).code(this.code).isSuccess(this.isSuccess).httpStatus(HttpStatus.OK).build();
    }
}
