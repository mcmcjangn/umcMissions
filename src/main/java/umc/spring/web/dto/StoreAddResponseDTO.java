// dto/StoreAddResponseDTO.java
package umc.spring.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StoreAddResponseDTO {
    private Long id;
    private String name;
    private String address;
    private String specAddress;
}