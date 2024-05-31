package umc.spring.apiPayLoad.code;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@Builder
public class ReasonDTO {
    private String message;
    private String code;
    private boolean isSuccess;
    private HttpStatus httpStatus;
}

