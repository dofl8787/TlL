package com.ssafy.flody.dto.request.Boards;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentUpdateRequestDto {
    private Long boaNo;
    private Long useNo;
    private Long upper;
    private String comment;
    private Integer kids;

    @Builder
    public CommentUpdateRequestDto(
            Long boaNo, Long useNo, Long upper, String comment, Integer kids
    ){
        this.boaNo = boaNo;
        this.useNo = useNo;
        this.upper = upper;
        this.comment = comment;
        this.kids = kids;
    }
}
