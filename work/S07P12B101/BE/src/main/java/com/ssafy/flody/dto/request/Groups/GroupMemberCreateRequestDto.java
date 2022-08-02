package com.ssafy.flody.dto.request.Groups;

import com.ssafy.flody.domain.groups.members.GMembers;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GroupMemberCreateRequestDto {
    //gro + use + gr
    private Long groNo;
    private Long useNo;
    private Long grNo;

    @Builder
    public GroupMemberCreateRequestDto(Long groNo, Long useNo, Long grNo){
        this.groNo = groNo;
        this.useNo = useNo;
        this.grNo = grNo;
    }

    public GMembers toEntity(){
        return GMembers.builder()
                .groNo(groNo)
                .useNo(useNo)
                .grNo(grNo)
                .build();
    }
}
