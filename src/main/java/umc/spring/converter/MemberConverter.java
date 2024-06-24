
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package umc.spring.converter;

import umc.spring.domain.Member;
import umc.spring.domain.enums.Gender;
import umc.spring.domain.enums.SocialType;
import umc.spring.web.dto.MemberRequestDTO;
import umc.spring.web.dto.MemberResponseDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemberConverter {

    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member){
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }
    public static Member toMember(MemberRequestDTO.JoinDto request){

        Gender gender = null;
        SocialType socialType = null;

        switch (request.getGender()){
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            case 3:
                gender = Gender.NONE;
                break;
        }

        List<Long> preferCategory = request.getPreferCategory();
        if (preferCategory == null) {
            preferCategory = new ArrayList<>();
        }

        return Member.builder()
                .address(request.getAddress())
                .spec_address(request.getSpec_address())
                .gender(gender)
                .name(request.getName())
                .age(request.getAge())
                .email(request.getEmail())
                .phone(request.getPhone())
                .memberFoodList(new ArrayList<>())
                .build();
    }
}