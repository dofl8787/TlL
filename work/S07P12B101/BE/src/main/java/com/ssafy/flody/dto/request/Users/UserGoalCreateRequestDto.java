package com.ssafy.flody.dto.request.Users;

import com.ssafy.flody.domain.users.goals.UGoals;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@NoArgsConstructor
public class UserGoalCreateRequestDto {
    private Long useNo;
    private String name;
    private Date registDate;

    private Date dueDate;
    @Builder
    public UserGoalCreateRequestDto(Long useNo, String name, Date registDate, Date dueDate ){
        this.useNo = useNo;
        this.name = name;
        this.registDate = registDate;
        this.dueDate = dueDate;
    }

    public UGoals toEntity(){
        return UGoals.builder()
                .useNo(useNo)
                .name(name)
                .registDate(registDate)
                .dueDate(dueDate)
                .build();
    }
}
