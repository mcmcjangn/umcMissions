
// IntelliJ API Decompiler stub source generated from a class file
// Implementation of methods is not available

package umc.spring.service.MemberService;


public interface MemberCommandService {
    void addMissionToMember(Long memberId, Long missionId);
    umc.spring.domain.Member joinMember(umc.spring.web.dto.MemberRequestDTO.JoinDto request);
}