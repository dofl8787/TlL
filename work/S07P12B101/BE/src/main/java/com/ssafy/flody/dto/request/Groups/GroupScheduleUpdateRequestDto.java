package com.ssafy.flody.dto.request.Groups;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class GroupScheduleUpdateRequestDto {
    //grono, gsNo
    private Long gsNo;
    private Long groNo;
    private String title;
    private String detail;
    private Date startDate;
    private Date endDate;
    private Boolean done;

    @Builder
    public GroupScheduleUpdateRequestDto(
            Long gsNo, Long groNo, String title, String detail,
            Date startDate, Date endDate, Boolean done
    ){
        this.gsNo = gsNo;
        this.groNo = groNo;
        this.title = title;
        this.detail = detail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.done = done;
    }
}
