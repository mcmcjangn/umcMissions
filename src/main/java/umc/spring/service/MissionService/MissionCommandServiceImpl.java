package umc.spring.service.MissionService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Mission;
import umc.spring.domain.Store;
import umc.spring.repository.MissionRepository;
import umc.spring.repository.StoreRepository;

@Service
public class MissionCommandServiceImpl implements MissionCommandService {
    private final StoreRepository storeRepository;
    private final MissionRepository missionRepository;

    public MissionCommandServiceImpl(StoreRepository storeRepository, MissionRepository missionRepository) {
        this.storeRepository = storeRepository;
        this.missionRepository = missionRepository;
    }

    @Override
    public Mission addMissionToStore(Long storeId, Mission mission) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid store ID: " + storeId));
        mission.setStore(store);
        missionRepository.save(mission);
        return mission;
    }
}