package com.ssafy.flody.dto.response.Boards;

import com.ssafy.flody.domain.boards.Boards;
import lombok.Getter;

import java.util.Date;

@Getter
public class BoardDetailResponseDto {
    private Long useNo;
    private Long catNo;
    private Long covNo;
    private String title;
    private String content;
    private String hashtag;
    private Integer likeCnt;
    private Integer commentCnt;
    private Date postDate;

    public BoardDetailResponseDto(Boards entity){
        this.useNo = entity.getUseNo();
        this.catNo = entity.getCatNo();
        this.covNo = entity.getCovNo();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.hashtag = entity.getHashtag();
        this.likeCnt = entity.getLikeCnt();
        this.commentCnt = entity.getCommentCnt();
        this.postDate = entity.getPostDate();
    }
}
