package umc.spring.service.MissionService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Mission;
import umc.spring.repository.MissionRepository;

import java.util.List;

@Service
public class MissionQueryServiceImpl implements MissionQueryService {
    private final MissionRepository missionRepository;

    public MissionQueryServiceImpl(MissionRepository missionRepository) {
        this.missionRepository = missionRepository;
    }

    @Override
    public List<Mission> getMissionsByStore(Long storeId) {
        return missionRepository.findByStoreId(storeId);
    }
}