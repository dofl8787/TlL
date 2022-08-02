package com.ssafy.flody.dto.request.Groups;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class GroupGoalUpdateRequestDto {
    private Long groNo;
    private Long ggNo;
    private String title;
    private Date registDate;
    private Date dueDate;

    @Builder
    public GroupGoalUpdateRequestDto(
            Long groNo, Long ggNo, String title, Date registDate, Date dueDate
    ){
        this.groNo = groNo;
        this.ggNo = ggNo;
        this.title = title;
        this.registDate = registDate;
        this.dueDate = dueDate;
    }
}
