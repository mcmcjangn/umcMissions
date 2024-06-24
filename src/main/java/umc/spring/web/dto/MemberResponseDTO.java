package umc.spring.web.dto;

import java.time.LocalDateTime;

public class MemberResponseDTO {

    public static class JoinResultDTO {
        private Long memberId;
        private LocalDateTime createdAt;

        public static JoinResultDTOBuilder builder() {
            return new JoinResultDTOBuilder();
        }

        public Long getMemberId() {
            return memberId;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public static class JoinResultDTOBuilder {
            private Long memberId;
            private LocalDateTime createdAt;

            JoinResultDTOBuilder() {
            }

            public JoinResultDTOBuilder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            public JoinResultDTOBuilder createdAt(LocalDateTime createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            public JoinResultDTO build() {
                return new JoinResultDTO(memberId, createdAt);
            }
        }

        public JoinResultDTO(Long memberId, LocalDateTime createdAt) {
            this.memberId = memberId;
            this.createdAt = createdAt;
        }
    }
}