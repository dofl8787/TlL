package com.ssafy.flody.dto.response.Boards;

import com.ssafy.flody.domain.boards.Boards;
import lombok.Getter;

import java.util.Date;

@Getter
public class BoardListResponseDto {
    private Long boaNo; //추가
    private Long useNo;
    private Long catNo;
    //private Long covNo;
    private String title;
    private Integer likeCnt;
    private Integer commentCnt;
    private Date postDate;

    public BoardListResponseDto(Boards entity){
        this.boaNo = entity.getBoaNo();
        this.useNo = entity.getUseNo();
        this.catNo = entity.getCatNo();
        this.title = entity.getTitle();
        this.likeCnt = entity.getLikeCnt();
        this.commentCnt = entity.getCommentCnt();
        this.postDate = entity.getPostDate();
    }
}
