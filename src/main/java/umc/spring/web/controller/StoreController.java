package umc.spring.web.controller;

import org.springframework.web.bind.annotation.*;
import umc.spring.domain.Store;
import umc.spring.service.StoreService.StoreCommandService;
import umc.spring.service.StoreService.StoreQueryService;

import java.util.List;

@RestController
@RequestMapping("/stores")
public class StoreController {

    private final StoreCommandService storeCommandService;
    private final StoreQueryService storeQueryService;

    public StoreController(StoreCommandService storeCommandService, StoreQueryService storeQueryService) {
        this.storeCommandService = storeCommandService;
        this.storeQueryService = storeQueryService;
    }

    @PostMapping
    public Store addStore(@RequestBody Store store) {
        return storeCommandService.addStore(store);
    }

    @PostMapping("/region/{regionId}")
    public Store addStoreToRegion(@PathVariable Long regionId, @RequestBody Store store) {
        return storeCommandService.addStoreToRegion(regionId, store);
    }

    @GetMapping("/{id}")
    public Store getStore(@PathVariable Long id) {
        return storeQueryService.getStore(id);
    }

    @GetMapping
    public List<Store> getAllStores() {
        return storeQueryService.getAllStores();
    }
}