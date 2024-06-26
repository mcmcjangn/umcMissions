package umc.spring.converter;

import umc.spring.domain.Member;

import java.time.LocalDateTime;
import java.util.ArrayList;

import umc.spring.domain.enums.Gender;
import umc.spring.domain.enums.MemberStatus;
import umc.spring.web.dto.MemberRequestDTO;
import umc.spring.web.dto.MemberResponseDTO;

public class MemberConverter {
    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member) {
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Member toMember(MemberRequestDTO.JoinDto request){

        Gender gender = null;

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

        return Member.builder()
                .name(request.getName())
                .gender(gender)
                .socialType(request.getSocialType())
                .status(MemberStatus.ACTIVE)
                .age(request.getAge())
                .address(request.getAddress())
                .spec_address(request.getSpec_address())
                .phone(request.getPhone())
                .email(request.getEmail())
                .memberPreferList(new ArrayList<>())
                .build();
    }
}
