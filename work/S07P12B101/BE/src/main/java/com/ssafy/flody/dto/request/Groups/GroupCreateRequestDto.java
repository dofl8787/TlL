package com.ssafy.flody.dto.request.Groups;

import com.ssafy.flody.domain.groups.Groups;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

//스터디 구성원(many to many table)에서 진행? 뭐가 맞는지 모르겠습니당
@Getter
@NoArgsConstructor
public class GroupCreateRequestDto {
    private String name;

    @Builder
    public GroupCreateRequestDto(String name){
        this.name = name;
    }

    public Groups toEntity(){
        return Groups.builder()
                .name(name)
                .build();
    }

}
