package umc.spring.web.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.enums.SocialType;

import java.util.List;

public class MemberRequestDTO {

    @Getter
    public static class JoinDto {
        //@NotBlank
        private String name;

        //@NotNull
        private Integer gender;

        //@NotNull
        private SocialType socialType;

        //@NotNull
        private Integer age;

        //@NotBlank
        private String address;

        //@NotBlank
        private String spec_address;

        //@NotBlank
        private String phone;

        //@Email
        //@NotBlank
        private String email;

        List<Long> preferCategory;

    }
}
