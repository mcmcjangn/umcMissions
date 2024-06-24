package umc.spring.service.MissionService;

import umc.spring.domain.Mission;

public interface MissionCommandService {
    Mission addMissionToStore(Long storeId, Mission mission);
}