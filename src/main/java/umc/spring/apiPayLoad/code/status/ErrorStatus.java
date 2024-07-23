package umc.spring.apiPayLoad.code.status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import umc.spring.apiPayLoad.code.BaseErrorCode;
import umc.spring.apiPayLoad.code.ErrorReasonDTO;

@AllArgsConstructor
@Getter
public enum ErrorStatus implements BaseErrorCode {
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "COMMON500", "Server Error, 관리자 문의 바랍니다."),
    BAD_REQUEST(HttpStatus.BAD_REQUEST, "COMMON400", "Bad Request"),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED, "COMMON401", "Unauthorized"),
    FORBIDDEN(HttpStatus.FORBIDDEN, "COMMON403", "Forbidden"),
    //멤버 관련 에러
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND, "MEMBER404", "Member Not Found"),
    NICKNAME_NOT_EXIST(HttpStatus.BAD_REQUEST, "MEMBER4002", "닉네임은 필수 입니다."),
    NICKNAME_DUPLICATE(HttpStatus.BAD_REQUEST, "MEMBER4003", "닉네임이 중복되었습니다."),
    //토큰 관련 에러
    TOKEN_NOT_FOUND(HttpStatus.NOT_FOUND, "TOKEN404", "Token Not Found"),
    TOKEN_EXPIRED(HttpStatus.BAD_REQUEST, "TOKEN4001", "Token Expired"),
    TOKEN_INVALID(HttpStatus.BAD_REQUEST, "TOKEN4002", "Token Invalid"),
    //이메일 관련 에러
    EMAIL_NOT_FOUND(HttpStatus.NOT_FOUND, "EMAIL404", "Email Not Found"),
    EMAIL_DUPLICATE(HttpStatus.BAD_REQUEST, "EMAIL4001", "Email Duplicate"),
    EMAIL_INVALID(HttpStatus.BAD_REQUEST, "EMAIL4002", "Email Invalid"),
    //비밀번호 관련 에러
    PASSWORD_NOT_FOUND(HttpStatus.NOT_FOUND, "PASSWORD404", "Password Not Found"),
    PASSWORD_INVALID(HttpStatus.BAD_REQUEST, "PASSWORD4001", "Password Invalid"),
    PASSWORD_NOT_MATCH(HttpStatus.BAD_REQUEST, "PASSWORD4002", "Password Not Match"),
    PASSWORD_DUPLICATE(HttpStatus.BAD_REQUEST, "PASSWORD4003", "Password Duplicate"),
    //프로필 관련 에러
    PROFILE_NOT_FOUND(HttpStatus.NOT_FOUND, "PROFILE404", "Profile Not Found"),
    PROFILE_DUPLICATE(HttpStatus.BAD_REQUEST, "PROFILE4001", "Profile Duplicate"),
    PROFILE_INVALID(HttpStatus.BAD_REQUEST, "PROFILE4002", "Profile Invalid"),
    //게시글 관련 에러
    ARTICLE_NOT_FOUND(HttpStatus.NOT_FOUND, "ARTICLE4001", "게시글이 없습니다."),
    ARTICLE_INVALID(HttpStatus.BAD_REQUEST, "ARTICLE4002", "게시글이 유효하지 않습니다."),
    ARTICLE_DUPLICATE(HttpStatus.BAD_REQUEST, "ARTICLE4003", "게시글이 중복되었습니다."),
    //댓글 관련 에러
    COMMENT_NOT_FOUND(HttpStatus.NOT_FOUND, "COMMENT4001", "댓글이 없습니다."),
    COMMENT_INVALID(HttpStatus.BAD_REQUEST, "COMMENT4002", "댓글이 유효하지 않습니다."),
    COMMENT_DUPLICATE(HttpStatus.BAD_REQUEST, "COMMENT4003", "댓글이 중복되었습니다."),
    //푸드 카테고리 에러
    FOOD_CATEGORY_NOT_FOUND(HttpStatus.NOT_FOUND, "FOOD4001", "푸드 카테고리가 없습니다."),
    FOOD_CATEGORY_INVALID(HttpStatus.BAD_REQUEST, "FOOD4002", "푸드 카테고리가 유효하지 않습니다."),
    //테스트에러
    TEMP_EXCEPTION(HttpStatus.BAD_REQUEST, "TEMP4001", "이거는 테스트");


    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    @Override
    public ErrorReasonDTO getReasonHttpStatus() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }

    @Override
    public ErrorReasonDTO getReason() {
        return ErrorReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(false)
                .httpStatus(httpStatus)
                .build();
    }
}