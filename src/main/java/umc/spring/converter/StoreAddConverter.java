// converter/StoreAddConverter.java
package umc.spring.converter;

import umc.spring.domain.Store;
import umc.spring.web.dto.StoreAddRequestDTO;

public class StoreAddConverter {
    public static Store toStore(StoreAddRequestDTO request) {
        return Store.builder()
                .name(request.getName())
                .address(request.getAddress())
                .build();
    }
}