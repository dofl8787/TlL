package com.ssafy.flody.dto.request.Users;

import com.ssafy.flody.domain.users.schedules.USchedules;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserScheduleCreateRequestDto {
    private Long useNo;
    private String title;
    private String detail;
    private Date startDate;
    private Date endDate;

    @Builder
    public UserScheduleCreateRequestDto(String title, String detail, Date startDate, Date endDate){
        this.title = title;
        this.detail = detail;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public USchedules toEntity(){
        return USchedules.builder()
                .title(title)
                .detail(detail)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
