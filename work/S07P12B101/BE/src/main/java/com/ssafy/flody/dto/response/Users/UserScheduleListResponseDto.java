package com.ssafy.flody.dto.response.Users;

import com.ssafy.flody.domain.users.schedules.USchedules;
import lombok.Getter;

import java.util.Date;

@Getter
public class UserScheduleListResponseDto {
    //private Long useNo;
    private String title;
    private Date startDate;
    private Date endDate;
    private Boolean done;

    public UserScheduleListResponseDto(USchedules entity){
        this.title = entity.getTitle();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
        this.done = entity.getDone();
    }
}
