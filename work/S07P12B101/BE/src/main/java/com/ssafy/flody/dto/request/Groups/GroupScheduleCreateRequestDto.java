package com.ssafy.flody.dto.request.Groups;

import com.ssafy.flody.domain.groups.schedules.GSchedules;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class GroupScheduleCreateRequestDto {
    //groNo
    private Long groNo;
    private String title;
    private String detail;
    private Date startDate;
    private Date endDate;

    @Builder
    public GroupScheduleCreateRequestDto(Long groNo, String title, String detail, Date startDate, Date endDate){
        this.groNo = groNo;
        this.title = title;
        this.detail = detail;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //DTO to Entity
    public GSchedules toEntity(){
        return GSchedules.builder()
                .groNo(groNo)
                .title(title)
                .detail(detail)
                .startDate(startDate)
                .endDate(endDate)
                .build();
    }
}
