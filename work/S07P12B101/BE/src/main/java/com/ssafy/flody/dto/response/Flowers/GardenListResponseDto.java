package com.ssafy.flody.dto.response.Flowers;

import com.ssafy.flody.domain.flowers.gardens.Gardens;
import lombok.Getter;

import java.util.Date;

@Getter
public class GardenListResponseDto {
    private Long floNo;
    private Long useNo;
    private Integer exp;
    private Date startDate;
    private Date endDate;

    public GardenListResponseDto(Gardens entity){
        this.floNo = entity.getFloNo();
        this.useNo = entity.getUseNo();
        this.exp = entity.getExp();
        this.startDate = entity.getStartDate();
        this.endDate = entity.getEndDate();
    }
}
