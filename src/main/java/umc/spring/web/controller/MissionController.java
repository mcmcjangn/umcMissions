package umc.spring.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umc.spring.domain.Mission;
import umc.spring.service.MemberService.MemberCommandService;
import umc.spring.service.MissionService.MissionCommandService;
import umc.spring.service.MissionService.MissionQueryService;
import umc.spring.validation.anootation.MissionChallengeValid;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/missions")
public class MissionController {
    private final MissionCommandService missionCommandService;
    private final MissionQueryService missionQueryService;
    private final MemberCommandService memberCommandService;

    public MissionController(MissionCommandService missionCommandService, MissionQueryService missionQueryService, MemberCommandService memberCommandService) {
        this.missionCommandService = missionCommandService;
        this.missionQueryService = missionQueryService;
        this.memberCommandService = memberCommandService;
    }

    @PostMapping("/stores/{storeId}")
    public ResponseEntity<Mission> addMissionToStore(@PathVariable Long storeId, @RequestBody Mission mission) {
        Mission savedMission = missionCommandService.addMissionToStore(storeId, mission);
        return ResponseEntity.created(URI.create("/missions/" + savedMission.getId())).body(savedMission);
    }

    @GetMapping("/stores/{storeId}")
    public ResponseEntity<List<Mission>> getMissionsByStore(@PathVariable Long storeId) {
        List<Mission> missions = missionQueryService.getMissionsByStore(storeId);
        return ResponseEntity.ok(missions);
    }

    @PostMapping("/{missionId}/members/{memberId}")
    public ResponseEntity<Void> addMissionToMember(@PathVariable @MissionChallengeValid Long missionId, @PathVariable Long memberId) {
        memberCommandService.addMissionToMember(memberId, missionId);
        return ResponseEntity.ok().build();
    }
}