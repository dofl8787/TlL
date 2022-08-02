package com.ssafy.flody.dto.request.Boards;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardUpateRequestDto {
    private Long useNo;
    private Long boaNo;
    private Long catNo;
    private Long covNo;
    private String title;
    private String content;
    private String hashtag;

    @Builder
    public BoardUpateRequestDto(
            Long useNo, Long boaNo, Long catNo, Long covNo,
            String title, String content, String hashtag
    ){
        this.useNo = useNo;
        this.boaNo = boaNo;
        this.catNo = catNo;
        this.covNo = covNo;
        this.title = title;
        this.content = content;
        this.hashtag = hashtag;
    }
}
