package umc.spring.web.dto;

import jakarta.annotation.Nullable;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import umc.spring.domain.enums.SocialType;

import java.util.List;

@Getter
public class MemberRequestDTO {

    public static class JoinDto {
        @NotNull(message = "이름을 입력해주세요.")
        @Size(max = 20)
        private String name;

        @NotNull(message = "성별을 입력해주세요.")
        private Integer gender;

        @Nullable
        private SocialType socialType;

        @NotNull(message = "나이를 입력해주세요.")
        private Integer age;

        @NotNull(message = "주소를 입력해주세요.")
        @Size(max = 40, message = "주소는 40자 이내로 입력해주세요.")
        private String address;

        @NotNull(message = "상세주소를 입력해주세요.")
        @Size(max = 40, message = "상세주소는 40자 이내로 입력해주세요.")
        private String spec_address;

        @NotNull(message = "전화번호를 입력해주세요.")
        @Size(max = 20, message = "전화번호는 20자 이내로 입력해주세요.")
        private String phone;

        @NotNull(message = "이메일을 입력해주세요.")
        @Size(max = 50)
        private String email;

        private List<Long> preferCategory;
        public String getName() {
            return name;
        }

        public Integer getGender() {
            return gender;
        }

        public SocialType getSocialType() {
            return socialType;
        }

        public Integer getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public String getSpec_address() {
            return spec_address;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public List<Long> getPreferCategory() {
            return preferCategory;
        }
    }


}