package umc.spring.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MissionChallengeRequestDTO {
    private Long missionId;
    private Long memberId;
}