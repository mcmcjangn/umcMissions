package umc.spring.domain.enums;

public enum SocialType {
    APPLE,
    GOOGLE,
    KAKAO;

    public static SocialType fromString(String socialType) {
        for (SocialType type : SocialType.values()) {
            if (type.name().equalsIgnoreCase(socialType)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant " + socialType);
    }
}
