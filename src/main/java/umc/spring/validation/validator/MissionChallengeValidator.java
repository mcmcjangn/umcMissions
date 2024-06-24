// validation/MissionChallengeValidator.java
package umc.spring.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import umc.spring.domain.Member;
import umc.spring.domain.enums.MissionStatus;
import umc.spring.domain.mapping.MemberMission;
import umc.spring.repository.MemberRepository;
import umc.spring.repository.MissionRepository;
import umc.spring.validation.anootation.MissionChallengeValid;

import java.util.List;

public class MissionChallengeValidator implements ConstraintValidator<MissionChallengeValid, Long> {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MissionRepository missionRepository;

    @Override
    public boolean isValid(Long missionId, ConstraintValidatorContext context) {
        Member member = memberRepository.findById(missionId)
                .orElseThrow(() -> new IllegalArgumentException("Member not found"));
        List<MemberMission> memberMissions = member.getMemberMissionList();

        for (MemberMission memberMission : memberMissions) {
            if (memberMission.getMission().getId().equals(missionId) && memberMission.getStatus() == MissionStatus.ASSIGNED) {
                return false;
            }
        }
        return true;
    }
}