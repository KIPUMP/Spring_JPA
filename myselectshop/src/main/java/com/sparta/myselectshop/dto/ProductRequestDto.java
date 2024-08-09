package com.sparta.myselectshop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequestDto {
    private String title;               // 관심 상품 명
    private String image;               // 사진
    private String link;                //구매 링크
    private int lprice;                 //최저가
}
