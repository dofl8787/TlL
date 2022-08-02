package com.ssafy.flody.dto.response.Users;

import com.ssafy.flody.domain.users.goals.UGoals;
import lombok.Getter;

import java.util.Date;

@Getter
public class UserGoalResponseDto {
    private Long ugNo;
    private Long useNo;
    private String title;
    private Date registDate;
    private Date dueDate;

    public UserGoalResponseDto(UGoals entity){
        this.ugNo = entity.getUgNo();
        this.useNo = entity.getUseNo();
        this.title = entity.getName();
        this.registDate = entity.getRegistDate();
        this.dueDate = entity.getDueDate();
    }
}
