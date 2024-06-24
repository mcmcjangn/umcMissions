// dto/ReviewResponse.java
package umc.spring.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewResponseDTO {
    private Long id;
    private String content;
    private int rating;
    private Long memberId;
}