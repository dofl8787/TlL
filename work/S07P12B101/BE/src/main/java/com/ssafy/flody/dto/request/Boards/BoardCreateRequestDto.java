package com.ssafy.flody.dto.request.Boards;


//request로 유저 넘버/ 카테고리 넘버를 받을 수 있을지 : 포스팅 시에 카테고리 넘버만 받고 service에서 처리한다고 했던 기억 O

import com.ssafy.flody.domain.boards.Boards;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardCreateRequestDto {
    private Long useNo;
    private Long catNo;
    private Long covNo;
    private String title;
    private String content;
    private String hashtag;

    @Builder
    public BoardCreateRequestDto(Long useNo, Long catNo, Long covNo, String title, String content, String hashtag){
        this.useNo = useNo;
        this.catNo = catNo;
        this.covNo = covNo;
        this.title = title;
        this.content = content;
        this.hashtag = hashtag;
    }
    // DTO to ENTITY
    public Boards toEntity(){
        return Boards.builder()
                .useNo(useNo)
                .catNo(catNo)
                .covNo(covNo)
                .title(title)
                .content(content)
                .hashtag(hashtag)
                .build();
    }
}
