package com.ssafy.flody.dto.request.Users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserGoalUpateRequestDto {
    private String title;
    private Date registDate;
    private Date dueDate;

    @Builder
    public UserGoalUpateRequestDto(String title, Date registDate, Date dueDate){
        this.title = title;
        this.registDate = registDate;
        this.dueDate = dueDate;
    }
}
