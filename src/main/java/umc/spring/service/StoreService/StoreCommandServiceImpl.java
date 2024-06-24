package umc.spring.service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umc.spring.domain.Mission;
import umc.spring.domain.Region;
import umc.spring.domain.Store;
import umc.spring.repository.RegionRepository;
import umc.spring.repository.StoreRepository;
import umc.spring.service.StoreService.StoreCommandService;

@Service
public class StoreCommandServiceImpl implements StoreCommandService {

    private final StoreRepository storeRepository;
    private final RegionRepository regionRepository;

    public StoreCommandServiceImpl(StoreRepository storeRepository, RegionRepository regionRepository) {
        this.storeRepository = storeRepository;
        this.regionRepository = regionRepository;
    }

    @Override
    public Store addStore(Store store) {
        return storeRepository.save(store);
    }

    @Override
    public Store addStoreToRegion(Long regionId, Store store) {
        Region region = regionRepository.findById(regionId)
                .orElseThrow(() -> new IllegalArgumentException("Region not found"));
        store.setRegion(region);
        return storeRepository.save(store);
    }



}