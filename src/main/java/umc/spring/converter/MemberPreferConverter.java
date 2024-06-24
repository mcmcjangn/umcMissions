package umc.spring.converter;

import umc.spring.domain.FoodCategory;
import umc.spring.domain.mapping.MemberFood;

import java.util.List;
import java.util.stream.Collectors;

public class MemberPreferConverter {

    public static List<MemberFood> toMemberPreferList(List<FoodCategory> foodCategoryList){

        return foodCategoryList.stream()
                .map(foodCategory ->
                        MemberFood.builder()
                                .foodCategory(foodCategory)
                                .build()
                ).collect(Collectors.toList());
    }
}