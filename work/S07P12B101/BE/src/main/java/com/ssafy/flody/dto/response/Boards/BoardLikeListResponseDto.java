package com.ssafy.flody.dto.response.Boards;

import com.ssafy.flody.domain.boards.likes.BLikes;
import lombok.Getter;

@Getter
public class BoardLikeListResponseDto {
    private long boaNo;
    private long useNo;

    public BoardLikeListResponseDto(BLikes entity){
        this.boaNo = entity.getBoaNo();
        this.useNo = entity.getUseNo();
    }
}
