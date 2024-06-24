package umc.spring.converter;

import umc.spring.domain.Member;
import umc.spring.domain.Mission;
import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.web.dto.MissionChallengeRequestDTO;
import umc.spring.web.dto.MissionChallengeResponseDTO;

public class MissionChallengeConverter {
    public static MemberMission toMemberMission(MissionChallengeRequestDTO request, Member member, Mission mission){
        return MemberMission.builder()
                .member(member)
                .mission(mission)
                .build();
    }

    public static MissionChallengeResponseDTO toMissionChallengeResponseDTO(MemberMission memberMission) {
        MissionChallengeResponseDTO response = new MissionChallengeResponseDTO();
        response.setSuccess(memberMission.getStatus() == MissionStatus.ASSIGNED);
        return response;
    }
}
