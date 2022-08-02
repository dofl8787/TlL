package com.ssafy.flody.dto.request.Boards;

import com.ssafy.flody.domain.boards.scraps.Scraps;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardScrapRequestDto {
    private Long useNo;
    private Long boaNo;

    @Builder
    public BoardScrapRequestDto(Long useNo, Long boaNo){
        this.useNo = useNo;
        this.boaNo = boaNo;
    }

    public Scraps toEntity(){
        return Scraps.builder()
                .useNo(useNo)
                .boaNo(boaNo)
                .build();
    }
}
