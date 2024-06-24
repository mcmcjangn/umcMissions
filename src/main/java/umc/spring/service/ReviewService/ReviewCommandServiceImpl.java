package umc.spring.service.ReviewService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.repository.ReviewRepository;
import umc.spring.repository.StoreRepository;

@Service
public class ReviewCommandServiceImpl implements ReviewCommandService {
    private final StoreRepository storeRepository;
    private final ReviewRepository reviewRepository;

    public ReviewCommandServiceImpl(StoreRepository storeRepository, ReviewRepository reviewRepository) {
        this.storeRepository = storeRepository;
        this.reviewRepository = reviewRepository;
    }

    @Override
    public Review addReviewToStore(Long storeId, Review review) {
        Store store = storeRepository.findById(storeId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid store ID: " + storeId));
        review.setStore(store);
        return reviewRepository.save(review);
    }
}