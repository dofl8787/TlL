package com.ssafy.flody.dto.request.Boards;

import com.ssafy.flody.domain.boards.reports.BReports;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BoardReportRequestDto {
    private Long useNo;
    private Long boaNo;
    private String content;

    @Builder
    public BoardReportRequestDto(Long useNo, Long boaNo, String content){
        this.useNo = useNo;
        this.boaNo = boaNo;
        this.content = content;
    }

    public BReports toEntity(){
        return BReports.builder()
                .useNo(useNo)
                .boaNo(boaNo)
                .content(content)
                .build();
    }
}
