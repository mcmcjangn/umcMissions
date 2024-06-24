package umc.spring.service.ReviewService;

import org.springframework.stereotype.Service;
import umc.spring.domain.Review;
import umc.spring.repository.ReviewRepository;

import java.util.List;

@Service
public class ReviewQueryServiceImpl implements ReviewQueryService {
    private final ReviewRepository reviewRepository;

    public ReviewQueryServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> getReviewsByStore(Long storeId) {
        return reviewRepository.findByStoreId(storeId);
    }

    @Override
    public List<Review> getReviewsByMember(Long memberId) {
        return reviewRepository.findByMemberId(memberId);
    }
}