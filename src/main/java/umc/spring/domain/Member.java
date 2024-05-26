package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.*;
import umc.spring.domain.mapping.MemberAgree;
import umc.spring.domain.mapping.MemberFood;
import umc.spring.domain.mapping.MemberMission;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private SocialType socialType;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'ACTIVE'")
    private MemberStatus status;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 40)
    private String address;

    @Column(nullable = false, length = 40)
    private String spec_address;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false)
    private Integer point;

    @Column
    private LocalDate inactiveDate;

    @OneToMany(mappedBy = "member")
    private List<Review> reviewList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberFood> memberFoodList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberMission> memberMissionList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberAgree> memberAgreeList = new ArrayList<>();

}
