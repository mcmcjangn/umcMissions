// dto/ReviewCreateRequest.java
package umc.spring.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewCreateRequestDTO {
    private String content;
    private int rating;
}