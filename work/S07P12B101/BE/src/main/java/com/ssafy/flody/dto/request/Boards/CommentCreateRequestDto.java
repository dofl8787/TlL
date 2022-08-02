package com.ssafy.flody.dto.request.Boards;

import com.ssafy.flody.domain.comments.Comments;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CommentCreateRequestDto {
    private Long useNo;
    private Long boaNo;
//    private Long upper;
    private String comment;
    // 가져와서 +1 해주는 (대댓글) 할 때 필요한가 ?

    @Builder
    public CommentCreateRequestDto(Long useNo, Long boaNo, Long upper, String comment, Integer kids){
        this.useNo = useNo;
        this.boaNo = boaNo;
//        this.upper = upper;
        this.comment = comment;
    }

    //dto to entity
    public Comments toEntity(){
        return Comments.builder()
                .useNo(useNo)
                .boaNo(boaNo)
//                .upper(upper)
                .comment(comment)
                .build();
    }
}
