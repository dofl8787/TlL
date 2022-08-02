package com.ssafy.flody.dto.request.Boards;

import com.ssafy.flody.domain.boards.likes.BLikes;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardLikeRequestDto {
    private Long useNo;
    private Long boaNo;

    @Builder
    public BoardLikeRequestDto(Long useNo, Long boaNo){
        this.useNo = useNo;
        this.boaNo = boaNo;
    }

    public BLikes toEntity(){
        return BLikes.builder()
                .useNo(useNo)
                .boaNo(boaNo)
                .build();
    }
}
