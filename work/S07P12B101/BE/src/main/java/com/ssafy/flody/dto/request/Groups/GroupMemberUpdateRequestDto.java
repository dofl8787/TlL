package com.ssafy.flody.dto.request.Groups;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GroupMemberUpdateRequestDto {
    private Long groNo;
    private Long useNo;
    private Long grNo;

    @Builder
    public GroupMemberUpdateRequestDto(Long groNo, Long useNo, Long grNo){
        this.groNo = groNo;
        this.useNo = useNo;
        this.grNo = grNo;
    }
}
