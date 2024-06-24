package umc.spring.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umc.spring.domain.Review;
import umc.spring.service.ReviewService.ReviewCommandService;
import umc.spring.service.ReviewService.ReviewQueryService;
import umc.spring.validation.anootation.StoreExistValid;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    private final ReviewCommandService reviewCommandService;
    private final ReviewQueryService reviewQueryService;

    public ReviewController(ReviewCommandService reviewCommandService, ReviewQueryService reviewQueryService) {
        this.reviewCommandService = reviewCommandService;
        this.reviewQueryService = reviewQueryService;
    }

    @PostMapping("/stores/{storeId}")
    public ResponseEntity<Review> addReviewToStore(@PathVariable @StoreExistValid Long storeId, @RequestBody Review review) {
        Review savedReview = reviewCommandService.addReviewToStore(storeId, review);
        return ResponseEntity.created(URI.create("/reviews/" + savedReview.getId())).body(savedReview);
    }

    @GetMapping("/stores/{storeId}")
    public ResponseEntity<List<Review>> getReviewsByStore(@PathVariable Long storeId) {
        List<Review> reviews = reviewQueryService.getReviewsByStore(storeId);
        return ResponseEntity.ok(reviews);
    }

    @GetMapping("/members/{memberId}")
    public ResponseEntity<List<Review>> getReviewsByMember(@PathVariable Long memberId) {
        List<Review> reviews = reviewQueryService.getReviewsByMember(memberId);
        return ResponseEntity.ok(reviews);
    }


}