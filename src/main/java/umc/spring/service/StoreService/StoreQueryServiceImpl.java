package umc.spring.service.StoreService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Store;
import umc.spring.repository.StoreRepository;

import java.util.List;

@Service
public class StoreQueryServiceImpl implements StoreQueryService {

    private final StoreRepository storeRepository;

    public StoreQueryServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store getStore(Long id) {
        return storeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Store not found"));
    }

    @Override
    public List<Store> getAllStores() {
        return storeRepository.findAll();
    }
}