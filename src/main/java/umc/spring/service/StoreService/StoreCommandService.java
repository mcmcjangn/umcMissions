package umc.spring.service.StoreService;

import umc.spring.domain.Mission;
import umc.spring.domain.Store;

public interface StoreCommandService {
    Store addStore(Store store);
    Store addStoreToRegion(Long regionId, Store store);

}