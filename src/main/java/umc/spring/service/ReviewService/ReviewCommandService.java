package umc.spring.service.ReviewService;

import umc.spring.domain.Review;

public interface ReviewCommandService {
    Review addReviewToStore(Long storeId, Review review);
}