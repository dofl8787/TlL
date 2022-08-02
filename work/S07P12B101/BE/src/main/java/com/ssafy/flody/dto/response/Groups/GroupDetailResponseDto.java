package com.ssafy.flody.dto.response.Groups;

import com.ssafy.flody.domain.groups.Groups;
import lombok.Getter;

@Getter
public class GroupDetailResponseDto {
    private Long groNo; //이후 추가되어야 할 것 : 스터디 구성원
    private String name;

    public GroupDetailResponseDto(Groups entity){
        this.groNo = entity.getGroNo();
        this.name = entity.getName();
    }
}
