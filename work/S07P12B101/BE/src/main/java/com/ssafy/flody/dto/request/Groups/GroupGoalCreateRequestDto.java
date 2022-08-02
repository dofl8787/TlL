package com.ssafy.flody.dto.request.Groups;

import com.ssafy.flody.domain.groups.goals.GGoals;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class GroupGoalCreateRequestDto {
    private Long groNo;
    private String name;
    private Date registDate;
    private Date dueDate;
    @Builder
    public GroupGoalCreateRequestDto(Long groNo, String name, Date registDate, Date dueDate){
        this.groNo = groNo;
        this.name = name;
        this.registDate = registDate;
        this.dueDate = dueDate;
    }

    //DTO to Entity
    public GGoals toEntity(){
        return GGoals.builder()
                .groNo(groNo)
                .name(name)
                .registDate(registDate)
                .dueDate(dueDate)
                .build();
    }
}
