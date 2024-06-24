package umc.spring.service.StoreService;

import umc.spring.domain.Store;

import java.util.List;

public interface StoreQueryService {
    Store getStore(Long id);
    List<Store> getAllStores();
}