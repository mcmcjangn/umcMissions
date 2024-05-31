package umc.spring.apiPayLoad.code;
import org.springframework.http.HttpStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ErrorReasonDTO {
    private String message;
    private String code;
    private boolean isSuccess;
    private HttpStatus httpStatus;
}
