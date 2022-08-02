package com.ssafy.flody.dto.response.Boards;

import com.ssafy.flody.domain.comments.likes.CLikes;

public class CommentLikeListResponseDto {
    private Long comNo;
    private Long useNo;

    public CommentLikeListResponseDto(CLikes entity){
        this.comNo = entity.getComNo();
        this.useNo = entity.getUseNo();
    }
}
