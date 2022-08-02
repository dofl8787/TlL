package com.ssafy.flody.dto.request.Users;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserScheduleUpdateRequestDto {
    //private Long useNo;
    private String title;
    private String detail;
    private Date startDate;
    private Date endDate;
    private Boolean done;

    @Builder
    public UserScheduleUpdateRequestDto(//Long useNo,
                                        String title, String detail, Date startDate, Date endDate, Boolean done
    ){
        //this.useNo = useNo;
        this.title = title;
        this.detail = detail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.done = done;
    }

}
