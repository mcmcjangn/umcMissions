package umc.spring.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import umc.spring.domain.common.BaseEntity;
import umc.spring.domain.enums.*;
import umc.spring.domain.mapping.MemberAgree;
import umc.spring.domain.mapping.MemberFood;
import umc.spring.domain.mapping.MemberMission;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@DynamicUpdate
@DynamicInsert
@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name = "member")
public class Member extends BaseEntity {
/*
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
    @ColumnDefault("NONE")
    private SocialType socialType;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
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

    @Builder.Default
    private Integer point = 0;

    @Column
    private LocalDate inactiveDate;
*/


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Column(nullable = false, length = 40)
    private String address;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDateTime inactiveDate;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String phone;

    private int point;

    @Column(length = 10, columnDefinition = "VARCHAR(10) DEFAULT 'NONE'")
    private String socialType;

    @Column(nullable = false, length = 40)
    private String spec_address;

    @Column(length = 15, columnDefinition = "VARCHAR(15) DEFAULT 'ACTIVE'")
    private String status;

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<MemberFood> memberFoodList = new ArrayList<>();

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<MemberMission> memberMissionList = new ArrayList<>();

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<MemberAgree> memberAgreeList = new ArrayList<>();

    public void addMemberMission(MemberMission memberMission) {
        memberMissionList.add(memberMission);
        memberMission.setMember(this);

    }
}
