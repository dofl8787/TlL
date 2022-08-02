package com.ssafy.flody.dto.response.Groups;

import com.ssafy.flody.domain.groups.schedules.GSchedules;
import lombok.Getter;

import java.util.Date;

@Getter
public class GroupScheduleDetailResponseDto {
    private Long gsNo;
    private Long groNo;
    private String title;
    private String detail;
    private Date startDate;
    private Date endDate;
    private Boolean done;

    public GroupScheduleDetailResponseDto(GSchedules entity){
        this.gsNo = entity.getGsNo();
        this.groNo = entity.getGroNo();
        this.title = entity.getTitle();
        this.detail = entity.getDetail();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
        this.done = entity.getDone();
    }
}
